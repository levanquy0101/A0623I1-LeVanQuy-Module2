package CaseStudy.Mobile.services;

import CaseStudy.Mobile.model.MobileCell;
import CaseStudy.Mobile.model.MobileGenuine;
import CaseStudy.Mobile.model.MobileModel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MobiService {
    private List<MobileModel> modelList = new ArrayList<>();

    public MobiService(){
        modelList.add(new MobileCell(1,"DT Neo7",65637,"OPPO","Trung Quốc","GOOD"));
        modelList.add(new MobileCell(2,"DT Neo9",75637,"OPPO","Trung Quốc","GOOD"));
        modelList.add(new MobileGenuine(3,"Note 7",78,"Samsung","31/01/2022",5035));
        modelList.add(new MobileGenuine(4,"Note 8",24,"Samsung","31/01/2024",5725));
    }

//    public void findName(String name){
//        for (int i = 0; i < modelList.size(); i++) {
//            if(Objects.equals(modelList.get(i).getName(), name)){
//                System.out.println("Điện thoại "+modelList.get(i).getName()+" có tồn tại trong danh sách");
//                break;
//            }
//        }
//    }
public List<MobileModel> findByName(String name) {
    return modelList.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
}
    public List<MobileModel> findAll(){
        return modelList;
    }

    public void delete(int id){
//        for (int i = 0; i < modelList.size(); i++) {
//            if(modelList.get(i).getId() == id){
//                modelList.remove(i);
//                break;
//            }
//        }

        modelList.removeIf(e -> e.getId() == id);
    }

    public void save(MobileModel model){
        if(model.getId() > 0){
            for (int i = 0; i < modelList.size(); i++) {
                if(modelList.get(i).getId() == model.getId()){
                    modelList.set(i, model);
                }
            }
        }
        else {
            int lastId = modelList.get(modelList.size()-1).getId();
            model.setId(lastId+1);
            modelList.add(model);
        }
    }

    public List<MobileModel> find(String name){
        return modelList.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
    }
    public List<MobileModel> sortByPrice() {
        return modelList.stream().sorted(Comparator.comparingDouble(MobileModel::getPrice)).collect(Collectors.toList());
    }
    public void WriteMoblie(String FILE_PATH, MobiService mobiService) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        List<MobileModel> modelList = mobiService.findAll();

//        for (MobileModel listAllG : modelList) {
//            if(listAllG instanceof MobileGenuine g){
//                bufferedWriter.write(g.getId() + "," + g.getName() + "," + g.getPrice() + "," + g.getProducer() + "," + g.getWarrantPeriod() + "," + g.getWarrantyCode() + "\n");
//            }
//        }
//
//        for (MobileModel listAllC : modelList) {
//            if(listAllC instanceof MobileCell c){
//                bufferedWriter.write(c.getId() + "," + c.getName() + "," + c.getPrice() + "," + c.getProducer() + "," + c.getCoutry() + "," + c.getStatus() + "\n");
//            }
//        }
            for (MobileModel mobile : modelList) {
                if (mobile instanceof MobileGenuine) {
                    MobileGenuine g = (MobileGenuine) mobile;
                    bufferedWriter.write(g.getId() + "," + g.getName() + "," + g.getPrice() + "," + g.getProducer() + "," + g.getWarrantPeriod() + "," + g.getWarrantyCode() + "\n");
                } else if (mobile instanceof MobileCell) {
                    MobileCell c = (MobileCell) mobile;
                    bufferedWriter.write(c.getId() + "," + c.getName() + "," + c.getPrice() + "," + c.getProducer() + "," + c.getCoutry() + "," + c.getStatus() + "\n");
                }
            }
        bufferedWriter.close();
        fileWriter.close();
    }

}

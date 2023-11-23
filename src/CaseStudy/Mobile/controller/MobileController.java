package CaseStudy.Mobile.controller;

import CaseStudy.Mobile.model.MobileCell;
import CaseStudy.Mobile.model.MobileGenuine;
import CaseStudy.Mobile.services.MobileCellServices;
import CaseStudy.Mobile.services.MobileCellServicesImpl;
import CaseStudy.Mobile.services.MobileGenuineService;
import CaseStudy.Mobile.services.MobileGenuineServiceImpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MobileController {
    private static final String FILE_PATH = "D:\\Codegym\\A0623I1-LeVanQuy-Module2\\src\\CaseStudy\\Mobile\\data\\mobile.csv";
    private static MobileGenuineService serviceG = new MobileGenuineServiceImpl();
    private static MobileCellServices serviceC = new MobileCellServicesImpl();
    public static void main(String[] args) throws IOException {
       menuMobile();
    }
    public static void menuMobile() throws IOException {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("----------MENU PHONE---------");
            System.out.println("1. Thêm mới điện thoại");
            System.out.println("2. Hiển thị danh sách điện thoại");
            System.out.println("3. Xóa điện thoại ra khỏi danh sách");
            System.out.println("4. Tìm kiếm điện thoại theo tên");
            System.out.println("5. Thoát");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    addMobile();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------");
                    WriteMoblie();
                    displayMobileG();
                    displayMobileC();
                    System.out.println("-----------------------------------------------------------------");
                    break;
                case 3:
                    deleteMobile();
                    break;
                case 4:
                    findMobile();
                    break;
                case 5:
                    System.exit(0);
            }
        }while (true);
    }
    public static void addMobile() throws IOException {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------Lựa chọn loại điện thoại cần thêm-------");
            System.out.println("1. Điện thoại chính hãng");
            System.out.println("2. Điện thoại xách tay");
            System.out.println("3. Trở về MENU điện thoại");
            int select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    System.out.println("-----Thêm điện thoại chính hãng------");
                    int idPhone1 = serviceG.getID();
                    System.out.println("Nhập tên điện thoại thêm vào: ");
                    String name1 = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    int price1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập nhà sản xuất: ");
                    String producer1 = sc.nextLine();
                    System.out.println("Nhập thời gian bảo hành: ");
                    String warrantPeriod1 = sc.nextLine();
                    System.out.println("Nhập mã số bảo hành: ");
                    int warrantyCode1 = Integer.parseInt(sc.nextLine());
                    MobileGenuine mG = new MobileGenuine(idPhone1,name1,price1,producer1,warrantPeriod1,warrantyCode1);
                    serviceG.addMobileG(mG);
                    WriteMoblie();
                    displayMobileG();
                    break;
                case 2:
                    System.out.println("-----Thêm điện thoại xách tay------");
                    int idPhone2 = serviceC.getID();
                    System.out.println("Nhập tên điện thoại thêm vào: ");
                    String name2 = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    int price2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập nhà sản xuất: ");
                    String producer2 = sc.nextLine();
                    System.out.println("Nhập quốc gia sản xuất: ");
                    String coutry2 = sc.nextLine();
                    System.out.println("Nhập tình trạng điện thoại: ");
                    String status2 = sc.nextLine();
                    MobileCell mC = new MobileCell(idPhone2,name2,price2,producer2,coutry2,status2);
                    serviceC.addMobileC(mC);
                    displayMobileC();
                    WriteMoblie();
                    break;
                case 3:
                    menuMobile();
            }
        }while (true);
    }
    public static void displayMobileG(){
        System.out.println("Hiển thị danh sách điện thoại chính hãng: ");
        List<MobileGenuine> mobileGenuineList = serviceG.getMobileAllG();
        for (MobileGenuine listAllG : mobileGenuineList) {
            System.out.println(listAllG);
        }

    }
    public static void displayMobileC(){
        System.out.println("Hiển thị danh sách điện thoại xách tay: ");
        List<MobileCell> mobileCellList = serviceC.getMobileAllC();
        for (MobileCell listAllC : mobileCellList) {
            System.out.println(listAllC);
        }
    }
    public static void WriteMoblie() throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        List<MobileGenuine> mobileGenuineList = serviceG.getMobileAllG();
        List<MobileCell> mobileCellList = serviceC.getMobileAllC();
        for (MobileGenuine listAllG : mobileGenuineList) {
            bufferedWriter.write(listAllG.getId() + "," + listAllG.getName() + "," + listAllG.getPrice() + "," + listAllG.getProducer() + "," + listAllG.getWarrantPeriod() + "," + listAllG.getWarrantyCode() + "\n");
        }
        for (MobileCell listAllC : mobileCellList) {
            bufferedWriter.write(listAllC.getId() + "," + listAllC.getName() + "," + listAllC.getPrice() + "," + listAllC.getProducer() + "," + listAllC.getCoutry() + "," + listAllC.getStatus() + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
    public static void deleteMobile(){
        System.out.println("Xóa sản phẩm");
    }
    public static void findMobile(){
        System.out.println("Tìm kiếm");
    }
}

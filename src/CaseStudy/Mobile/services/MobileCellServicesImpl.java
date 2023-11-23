package CaseStudy.Mobile.services;

import CaseStudy.Mobile.model.MobileCell;

import java.util.ArrayList;
import java.util.List;

public class MobileCellServicesImpl implements MobileCellServices {
    private static List<MobileCell> mobileCellList;
    private  static int id = 0;
    static {
        mobileCellList = new ArrayList<>();
        mobileCellList.add(new MobileCell(id++,"DT Neo7",65637,"OPPO","Trung Quốc","GOOD"));
        mobileCellList.add(new MobileCell(id++,"DT Neo9",75637,"OPPO","Trung Quốc","GOOD"));
    }
    @Override
    public int getID() {
        return id;
    }

    @Override
    public List<MobileCell> getMobileAllC() {
        return mobileCellList;
    }

    @Override
    public void addMobileC(MobileCell mC) {
        id++;
    }
}

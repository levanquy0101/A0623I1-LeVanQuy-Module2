package CaseStudy.Mobile.services;

import CaseStudy.Mobile.model.MobileGenuine;

import java.util.ArrayList;
import java.util.List;

public class MobileGenuineServiceImpl implements MobileGenuineService {
    private static List<MobileGenuine> mobileGenuineList;
    private  static int id = 0;
    static {
        mobileGenuineList = new ArrayList<>();
        mobileGenuineList.add(new MobileGenuine(id++,"Note 7",78,"Samsung","31/01/2022",5035));
        mobileGenuineList.add(new MobileGenuine(id++,"Note 8",24,"Samsung","31/01/2024",5725));
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public List<MobileGenuine> getMobileAllG() {
        return mobileGenuineList;
    }

    @Override
    public void addMobileG(MobileGenuine mG) {
        id++;
    }
}

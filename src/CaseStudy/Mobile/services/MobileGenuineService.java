package CaseStudy.Mobile.services;

import CaseStudy.FuramaResort.models.Employee;
import CaseStudy.Mobile.model.MobileGenuine;

import java.util.List;

public interface MobileGenuineService {
    int getID();
    List<MobileGenuine> getMobileAllG();
    void addMobileG(MobileGenuine mG);

}

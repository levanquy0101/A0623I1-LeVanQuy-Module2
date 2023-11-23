package CaseStudy.Mobile.services;

import CaseStudy.Mobile.model.MobileCell;


import java.util.List;

public interface MobileCellServices {
    int getID();
    List<MobileCell> getMobileAllC();
    void addMobileC(MobileCell mC);

}

package CaseStudy.Phone.seveices;

import CaseStudy.Mobile.model.MobileCell;
import CaseStudy.Phone.model.PhoneModel;

import java.util.List;

public interface PhoneService {
    void addNewPhone(PhoneModel phoneModel);
    List<PhoneModel> getMobileAllC();
}

package ss19_case_study.respository.implement;

import ss19_case_study.model.facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    Map<Facility,Integer> getAll();
    void addFacility(Facility facility);
    void removeFacility(Facility facility);
    Facility getByID(String id);
    void maintenance(Facility facility);
}

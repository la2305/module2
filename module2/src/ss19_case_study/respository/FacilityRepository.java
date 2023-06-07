package ss19_case_study.respository;

import ss19_case_study.model.facility.Facility;
import ss19_case_study.model.facility.House;
import ss19_case_study.model.facility.Room;
import ss19_case_study.model.facility.Villa;
import ss19_case_study.respository.implement.IFacilityRepository;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Facility,Integer> facilities = new LinkedHashMap<>();
    private static final LocalDate resetTime = LocalDate.now();
    static {
        Facility house = new House("SVHO-1001","House",50,5000,10,"year","Five star",4);
        Facility room =new Room("SVRO-2001","Room",60,10000,15,"month","Free clear paper");
        Facility villa =new Villa("SRVL-3001","Villa",100,200000,40,"day","ten star",1000,10);
        facilities.put(house,0);
        facilities.put(room,5);
        facilities.put(villa,0);
        //public House(String serviceCode, String serviceName, int areaUse, float rentalCost, int maxNumberOfTenants, String typesOfRent, String roomStandard, int numberOfFloors) {
        //public Room(String serviceCode, String serviceName, int areaUse, float rentalCost, int maxNumberOfTenants, String typesOfRent, String serviceFreeInclude) {
        //public Villa(String serviceCode, String serviceName, int areaUse, float rentalCost, int maxNumberOfTenants, String typesOfRent, String roomStandard, int swimmingPoolArea, int numberOfFloors) {
        LocalDate now = LocalDate.now();
        if (now.getDayOfMonth()==1){
            for (Facility facility:facilities.keySet()) {
                facilities.put(facility,0);
            }
        }
    }

    @Override
    public Map<Facility, Integer> getAll() {
        return facilities;
    }

    @Override
    public void addFacility(Facility facility) {
        facilities.put(facility,0);
    }

    @Override
    public void removeFacility(Facility facility) {
        facilities.remove(facility);
    }

    @Override
    public Facility getByID(String id) {
        for (Facility facility:facilities.keySet()) {
            if (facility.getFacilityCode().equals(id)){
                return facility;
            }
        }
        return null;
    }

    @Override
    public void maintenance(Facility facility) {
        facilities.put(facility, facilities.get(facility)+1);
    }


}

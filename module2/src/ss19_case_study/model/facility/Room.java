package ss19_case_study.model.facility;

public class Room extends Facility{
    private String serviceFreeInclude;

    public Room(String serviceCode, String serviceName, int areaUse, float rentalCost, int maxNumberOfTenants, String typesOfRent, String serviceFreeInclude) {
        super(serviceCode, serviceName, areaUse, rentalCost, maxNumberOfTenants, typesOfRent);
        this.serviceFreeInclude = serviceFreeInclude;
    }

    public String getServiceFreeInclude() {
        return serviceFreeInclude;
    }

    public void setServiceFreeInclude(String serviceFreeInclude) {
        this.serviceFreeInclude = serviceFreeInclude;
    }

    @Override
    public String toString() {
        return super.toString()+"Room{" +
                "serviceFreeInclude='" + serviceFreeInclude + '\'' +
                '}';
    }
}

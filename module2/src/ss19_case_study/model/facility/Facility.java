package ss19_case_study.model.facility;

import java.util.Objects;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private int areaUse;
    private float rentalCost;
    private int maxNumberOfTenants;
    private String typesOfRent;

    public Facility(String serviceCode, String serviceName, int areaUse, float rentalCost, int maxNumberOfTenants, String typesOfRent) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.rentalCost = rentalCost;
        this.maxNumberOfTenants = maxNumberOfTenants;
        this.typesOfRent = typesOfRent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceCode, facility.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode);
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(int areaUse) {
        this.areaUse = areaUse;
    }

    public float getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(float rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberOfTenants() {
        return maxNumberOfTenants;
    }

    public void setMaxNumberOfTenants(int maxNumberOfTenants) {
        this.maxNumberOfTenants = maxNumberOfTenants;
    }

    public String getTypesOfRent() {
        return typesOfRent;
    }

    public void setTypesOfRent(String typesOfRent) {
        this.typesOfRent = typesOfRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse='" + areaUse + '\'' +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfTenants=" + maxNumberOfTenants +
                ", typesOfRent='" + typesOfRent + '\'' +
                '}';
    }
}

package ss19_case_study.model.facility;

import java.util.Objects;

public abstract class Facility {
    private String facilityCode;
    private String facilityName;
    private int areaUse;
    private float rentalCost;
    private int maxNumberOfTenants;
    private String typesOfRent;

    public Facility(String serviceCode, String serviceName, int areaUse, float rentalCost, int maxNumberOfTenants, String typesOfRent) {
        this.facilityCode = serviceCode;
        this.facilityName = serviceName;
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
        return Objects.equals(facilityCode, facility.facilityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facilityCode);
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
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
                "serviceCode='" + facilityCode + '\'' +
                ", serviceName='" + facilityName + '\'' +
                ", areaUse='" + areaUse + '\'' +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfTenants=" + maxNumberOfTenants +
                ", typesOfRent='" + typesOfRent + '\'' +
                '}';
    }
}

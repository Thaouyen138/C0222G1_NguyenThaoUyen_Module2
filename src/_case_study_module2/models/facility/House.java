package _case_study_module2.models.facility;

import _case_study_module2.models.facility.Facility;

public class House extends Facility {
    private String codeServices;
    private String standardHouse;
    private int floorHouse;

    public House() {
    }

    public House(String codeServices, String standardHouse, int floorHouse) {
        this.codeServices = codeServices;
        this.standardHouse = standardHouse;
        this.floorHouse = floorHouse;
    }

    public House(String nameService, double areaUsed, double cost, int amountPeople, String typeRent, String codeServices, String standardHouse, int floorHouse) {
        super(nameService, areaUsed, cost, amountPeople, typeRent);
        this.codeServices = codeServices;
        this.standardHouse = standardHouse;
        this.floorHouse = floorHouse;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return super.toString() +
                "standardHouse='" + standardHouse + '\'' +
                ", floorHouse=" + floorHouse ;
    }
}

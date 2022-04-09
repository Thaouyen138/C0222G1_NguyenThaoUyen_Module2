package _case_study_module2.models;

public class House extends Facility {
    private String standardHouse;
    private int floorHouse;

    public House() {
    }

    public House(String standardHouse, int floorHouse) {
        this.standardHouse = standardHouse;
        this.floorHouse = floorHouse;
    }

    public House(String nameService, double areaUsed, double cost, int amountPeople, String typeRent, String standardHouse, int floorHouse) {
        super(nameService, areaUsed, cost, amountPeople, typeRent);
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
                ", floorHouse=" + floorHouse +
                '}';
    }
}

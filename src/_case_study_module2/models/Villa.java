package _case_study_module2.models;

public class Villa extends Facility {
    private String standardVilla;
    private double swimPoolArea;
    private int floorVilla;

    public Villa() {
    }

    public Villa(String standardVilla, double swimPoolArea, int floorVilla) {
        this.standardVilla = standardVilla;
        this.swimPoolArea = swimPoolArea;
        this.floorVilla = floorVilla;
    }

    public Villa(String nameService, double areaUsed, double cost, int amountPeople, String typeRent, String standardVilla, double swimPoolArea, int floorVilla) {
        super(nameService, areaUsed, cost, amountPeople, typeRent);
        this.standardVilla = standardVilla;
        this.swimPoolArea = swimPoolArea;
        this.floorVilla = floorVilla;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getSwimPoolArea() {
        return swimPoolArea;
    }

    public void setSwimPoolArea(double swimPoolArea) {
        this.swimPoolArea = swimPoolArea;
    }

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String toString() {
        return super.toString()+
                "standardVilla='" + standardVilla + '\'' +
                ", swimPoolArea=" + swimPoolArea +
                ", floorVilla=" + floorVilla +
                '}';
    }
}

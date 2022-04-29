package _case_study_module2.models.facility;

import _case_study_module2.models.facility.Facility;

public class Villa extends Facility {
    private String codeServices;
    private String standardVilla;
    private double swimPoolArea;
    private int floorVilla;

    public Villa() {
    }

    public Villa(String codeServices, String standardVilla, double swimPoolArea, int floorVilla) {
        this.codeServices = codeServices;
        this.standardVilla = standardVilla;
        this.swimPoolArea = swimPoolArea;
        this.floorVilla = floorVilla;
    }

    public Villa(String nameService, double areaUsed, double cost, int amountPeople, String typeRent, String codeServices, String standardVilla, double swimPoolArea, int floorVilla) {
        super(nameService, areaUsed, cost, amountPeople, typeRent);
        this.codeServices = codeServices;
        this.standardVilla = standardVilla;
        this.swimPoolArea = swimPoolArea;
        this.floorVilla = floorVilla;
    }

    public String getCodeServices() {
        return codeServices;
    }

    public void setCodeServices(String codeServices) {
        this.codeServices = codeServices;
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
                ", floorVilla=" + floorVilla;
    }
}

package _case_study_module2.models.facility;

import _case_study_module2.models.facility.Facility;

public class Room extends Facility {
    private String codeServices;
    private String freeService;

    public Room() {
    }

    public Room(String codeServices, String freeService) {
        this.codeServices = codeServices;
        this.freeService = freeService;
    }

    public Room(String nameService, double areaUsed, double cost, int amountPeople, String typeRent, String codeServices, String freeService) {
        super(nameService, areaUsed, cost, amountPeople, typeRent);
        this.codeServices = codeServices;
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "codeServices='" + codeServices + '\'' +
                ", freeService='" + freeService + '\'' +
                '}';
    }

    public String stringToCsv(){
        return super.stringToCsv()+codeServices+","+freeService;
    }
}

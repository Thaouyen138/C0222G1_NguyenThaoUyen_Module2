package _case_study_module2.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, double areaUsed, double cost, int amountPeople, String typeRent, String freeService) {
        super(nameService, areaUsed, cost, amountPeople, typeRent);
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
        return super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}

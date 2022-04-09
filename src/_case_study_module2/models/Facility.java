package _case_study_module2.models;

import java.util.SplittableRandom;

public  abstract class Facility {
//Các loại dịch vụ này sẽ bao có các thông tin:
// Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
// Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
    private String nameService;
    private double areaUsed;
    private double cost;
    private  int amountPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String nameService, double areaUsed, double cost, int amountPeople, String typeRent) {
        this.nameService = nameService;
        this.areaUsed = areaUsed;
        this.cost = cost;
        this.amountPeople = amountPeople;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", areaUsed=" + areaUsed +
                ", cost=" + cost +
                ", amountPeople=" + amountPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}

package _case_study_module2.services.impl_interface;

import _case_study_module2.models.facility.Facility;
import _case_study_module2.models.facility.House;
import _case_study_module2.models.facility.Room;
import _case_study_module2.models.facility.Villa;
import _case_study_module2.services.interface_services.IFacilityServices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServicesImpl implements IFacilityServices {
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

//@Override
//    public void display() {
//        for (Map.Entry<Facility, Integer> element : facilityIntegerList.entrySet()) {
//            System.out.println("Service " + element.getKey() + " Số lần đã thuê " + element.getValue());
//        }
//    }
    @Override
    public void displayFacility() {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            System.out.println(facilityIntegerEntry.getKey());
        }
    }

    String name;
    double areaUsed;
    double cost;
    int people;
    String[] typeRent;
    int index;
    String codeServices;
    @Override
    public void addCommonFac() {
        System.out.print("enter name service: ");
        name = scanner.nextLine();
        System.out.print("enter area used: ");
        areaUsed = Double.parseDouble(scanner.nextLine());
        System.out.print("enter cost: ");
        cost = Double.parseDouble(scanner.nextLine());
        System.out.print("enter amount people to rent: ");
        people = Integer.parseInt(scanner.nextLine());
        System.out.println("type rent: ");
        typeRent = new String[]{"năm", "tháng", "ngày", "giờ"};
        for (int i = 0; i < typeRent.length; i++) {
            System.out.println(i + ": " + typeRent[i]);
        }
        System.out.print("enter type to rent: ");
        index = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public void addNewHouse() {
        addCommonFac();
        System.out.print("enter code services: ");
        codeServices=scanner.nextLine();
        System.out.print("enter standard house: ");
        String standardHouse = scanner.nextLine();
        System.out.print("enter floor house: ");
        int floor = Integer.parseInt(scanner.nextLine());

        House house = new House(name,areaUsed,cost,people,typeRent[index],codeServices,standardHouse,floor);
        facilityIntegerMap.put(house, 0);

    }

    @Override
    public void addNewVilla() {
        addCommonFac();
        System.out.print("enter code services: ");
        codeServices=scanner.nextLine();
        System.out.print("enter standard villa: ");
        String standardVilla = scanner.nextLine();
        System.out.print("enter swim pool area: ");
        double swimPool = Double.parseDouble(scanner.nextLine());
        System.out.print("enter floor villa: ");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(name,areaUsed,cost,people,typeRent[index],codeServices,standardVilla, swimPool, floor);
        facilityIntegerMap.put(villa, 0);
    }


    @Override
    public void addNewRoom() {
        addCommonFac();
        System.out.print("enter code services: ");
        codeServices=scanner.nextLine();
        System.out.print("enter service free:");
        String freeService = scanner.nextLine();
        Room room = new Room(name,areaUsed,cost,people,typeRent[index],codeServices,freeService);
        facilityIntegerMap.put(room, 0);
    }

    @Override
    public void displayFacilityMaintenance() {
    }


}

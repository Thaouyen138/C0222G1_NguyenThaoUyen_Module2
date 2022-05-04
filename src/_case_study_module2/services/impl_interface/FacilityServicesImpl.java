package _case_study_module2.services.impl_interface;

import _case_study_module2.models.facility.Facility;
import _case_study_module2.models.facility.House;
import _case_study_module2.models.facility.Room;
import _case_study_module2.models.facility.Villa;
import _case_study_module2.models.person.Customer;
import _case_study_module2.services.interface_services.IFacilityServices;
import _case_study_module2.utils.ReadAndWriteFile;
import _case_study_module2.utils.Regex;

import java.util.*;

public class FacilityServicesImpl implements IFacilityServices {
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List<Villa> villaList=readAndWriteFile.readFileVilla("src\\_case_study_module2\\data\\villa.csv");
    List<House> houseList=readAndWriteFile.readFileHouse("src\\_case_study_module2\\data\\house.csv");
    List<Room> roomList= readAndWriteFile.readFileRoom("src\\_case_study_module2\\data\\room.csv");
    List<Facility> facilityList=new ArrayList<>();
    public static final String REGEX_VILLA = "SVVL-\\d{4}";
    public static final String REGEX_HOUSE = "SVHO-(\\d{4})";
    public static final String REGEX_ROOM = "SVRO-\\d{4}";
    public static final String REGEX_NAME_SERVICE_TYPE_RENT_STANDARD = "[A-Z][a-z]+";

    //@Override
//    public void display() {
//        for (Map.Entry<Facility, Integer> element : facilityIntegerList.entrySet()) {
//            System.out.println("Service " + element.getKey() + " Số lần đã thuê " + element.getValue());
//        }
//    }
    @Override
    public void displayFacility() {
            facilityList.addAll(villaList);
            facilityList.addAll(houseList);
            facilityList.addAll(roomList);
        for (Facility f:facilityList
             ) {
            System.out.println(f);

        }
//        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
//            System.out.println(facilityIntegerEntry.getKey());
//        }
    }

    String name;
    double areaUsed;
    double cost;
    int people;
    String typeRent;
    int index;
    String codeServices;

    @Override
    public void addCommonFac() {
//        System.out.print("enter name service: ");
//        name = scanner.nextLine();
//        System.out.print("enter area used: ");
//        areaUsed = Double.parseDouble(scanner.nextLine());
//        System.out.print("enter cost: ");
//        cost = Double.parseDouble(scanner.nextLine());
//        System.out.print("enter amount people to rent: ");
//        people = Integer.parseInt(scanner.nextLine());
//        System.out.println("type rent: ");
//        typeRent = new String[]{"năm", "tháng", "ngày", "giờ"};
//        for (int i = 0; i < typeRent.length; i++) {
//            System.out.println(i + ": " + typeRent[i]);
//        }
//        System.out.print("enter type to rent: ");
//        index = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name services: ");
        name = inputNameTypeRentStandard();

        while (true) {
            try {
                System.out.print("enter area used: ");
                areaUsed = Double.parseDouble(scanner.nextLine());
                if (areaUsed > 30) {
                    break;
                } else {
                    System.out.println("bạn đã nhập sai định dạng, diện tích sử dụng phải là số thực lớn hơn 30 ");
                }
            } catch (Exception e) {
                System.out.println("input wrong format");
            }
        }
        while (true) {
            try {
                System.out.println("enter cost :");
                cost = Double.parseDouble(scanner.nextLine());
                if (cost > 0) {
                    break;
                } else {
                    System.out.println("bạn đã nhập sai định dạng, phí thuê phải là số thực dương");
                }
            } catch (Exception e) {
                System.out.println("input wrong format");
            }
        }
        while (true) {
            try {
                System.out.println("enter amount people to rent: ");
                people = Integer.parseInt(scanner.nextLine());
                if (people > 0 && people < 20) {
                    break;
                } else {
                    System.out.println("bạn đã nhập sai định dạng, số lượng người thuê phải lớn hơn 0 và nhỏ hơn 20");
                }
            } catch (Exception e) {
                System.out.println("input wrong format");
            }
        }
        System.out.println("enter type rent:");
        typeRent = inputNameTypeRentStandard();
    }


    @Override
    public void addNewVilla() {
        addCommonFac();
//        System.out.print("enter code services: ");
//        codeServices = scanner.nextLine();
//        System.out.print("enter standard villa: ");
//        String standardVilla = scanner.nextLine();
//        System.out.print("enter swim pool area: ");
//        double swimPool = Double.parseDouble(scanner.nextLine());
//        System.out.print("enter floor villa: ");
//        int floor = Integer.parseInt(scanner.nextLine());
//        Villa villa = new Villa(name, areaUsed, cost, people, typeRent[index], codeServices, standardVilla, swimPool, floor);
//        facilityIntegerMap.put(villa, 0);
        codeServices = inputIdVilla();
        System.out.println("enter stardard villa: ");
        String standardVilla = inputNameTypeRentStandard();
        double swimPool;
        while (true) {
            try {
                System.out.println("enter swimpool: ");
                swimPool = Double.parseDouble(scanner.nextLine());
                if (swimPool > 30) {
                    break;
                } else {
                    System.out.println("bạn đã nhập sai đinh dạng, diện tích hồ bơi phải là số thực lớn hơn 30");
                }
            } catch (Exception e) {
                System.out.println("input wrong format");
            }

        }
        int floor;
        while (true) {
            try {
                System.out.println("enter floor villa:");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("bạn đã nhập sai định dạng , sô tầng phải lớn hơn 0 và nhỏ hơn 20");
                }

            } catch (Exception e) {
                System.out.println("input wrong format");            }

        }
        Villa villa = new Villa(name, areaUsed, cost, people, typeRent, codeServices, standardVilla, swimPool, floor);
        facilityIntegerMap.put(villa,0);
        villaList.add(villa);
        readAndWriteFile.writeFile("src\\_case_study_module2\\data\\villa.csv",writeVillaToCSV(villaList));
    }

    @Override
    public void addNewHouse() {
        addCommonFac();
//        System.out.print("enter code services: ");
//        codeServices = scanner.nextLine();
//        System.out.print("enter standard house: ");
//        String standardHouse = scanner.nextLine();
//        System.out.print("enter floor house: ");
//        int floor = Integer.parseInt(scanner.nextLine());
//
//
        codeServices = inputIdHouse();
        System.out.println("enter standard house:");
        String standardHouse = inputNameTypeRentStandard();
        int floor;

        while (true) {
            try {
                System.out.println("enter floor house:");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("bạn đã nhập sai đinh dạng, số tầng phải lớn hơn 0");
                }
            } catch (Exception e) {
                System.out.println("input wrong format");
            }

        }
        House house = new House(name, areaUsed, cost, people, typeRent, codeServices, standardHouse, floor);
        facilityIntegerMap.put(house, 0);
        houseList.add(house);
        readAndWriteFile.writeFile("src\\_case_study_module2\\data\\house.csv",writeHouseToCSV(houseList));
    }


    @Override
    public void addNewRoom() {
        addCommonFac();
        System.out.print("enter code services: ");
//        codeServices = scanner.nextLine();
//        System.out.print("enter service free:");
//        String freeService = scanner.nextLine();
//        Room room = new Room(name, areaUsed, cost, people, typeRent[index], codeServices, freeService);
//        facilityIntegerMap.put(room, 0);
        codeServices = inputIdRoom();
        System.out.print("enter service free:");
        String freeService = scanner.nextLine();
        Room room = new Room(name, areaUsed, cost, people, typeRent, codeServices, freeService);
        facilityIntegerMap.put(room, 0);
        roomList.add(room);
        readAndWriteFile.writeFile("src\\_case_study_module2\\data\\room.csv",writeRoomToCSV(roomList));
    }

    @Override
    public void displayFacilityMaintenance() {
    }

    private String inputIdVilla() {
        System.out.println("enter id services villa:");
        return Regex.regexStr(scanner.nextLine(), REGEX_VILLA, "bạn đã nhập sai định dạng, mã dịch vụ phải có dạng SVVL-XXXX");
    }

    private String inputIdHouse() {
        System.out.println("enter id services house:");
        return Regex.regexStr(scanner.nextLine(), REGEX_HOUSE, "bạn đã nhập sai định dạng, mã dịch vụ phải có dạng SVHO-XXXX");
    }

    private String inputIdRoom() {
        System.out.println("enter id services room:");
        return Regex.regexStr(scanner.nextLine(), REGEX_ROOM, "bạn đã nhập sai định dạng, mã dịch vụ phải có dạng SVRO-XXXX");
    }

    private String inputNameTypeRentStandard() {
//        System.out.println("enter name service/typerent/stardard:");
        return Regex.regexStr(scanner.nextLine(), REGEX_NAME_SERVICE_TYPE_RENT_STANDARD, "bạn đã nhập sai định dạng,tên dịch vụ phải viết hoa chữ cái đầu");
    }

    public List<String> writeVillaToCSV(List<Villa> villaList) {
        List<String> stringList = new ArrayList<>();
        for (Villa villa :
                villaList) {
            stringList.add(villa.stringToCsv());
        }
        return stringList;
    }
    public List<String> writeHouseToCSV(List<House> houseList) {
        List<String> stringList = new ArrayList<>();
        for (House house :
                houseList) {
            stringList.add(house.stringToCsv());
        }
        return stringList;
    }
    public List<String> writeRoomToCSV(List<Room> roomList) {
        List<String> stringList = new ArrayList<>();
        for (Room room:
                roomList) {
            stringList.add(room.stringToCsv());
        }
        return stringList;
    }
}
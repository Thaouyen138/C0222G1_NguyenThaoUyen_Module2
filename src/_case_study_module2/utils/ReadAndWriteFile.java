package _case_study_module2.utils;

import _case_study_module2.models.facility.House;
import _case_study_module2.models.facility.Room;
import _case_study_module2.models.facility.Villa;
import _case_study_module2.models.other.Booking;
import _case_study_module2.models.person.Customer;
import _case_study_module2.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public void writeFile(String pathFile, List<String> stringList) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String str :
                    stringList) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public List<Customer> readFileCustomer(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings = new String[9];
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                customerList.add(new Customer(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8]));
            }
            ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customerList;
    }

    public List<Employee> readFileEmployee(String pathFile) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings = new String[9];
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                employeeList.add(new Employee(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8], Double.parseDouble(strings[9])));
            }
            ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    public List<Villa> readFileVilla(String pathFile) {
        List<Villa> villaList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings = new String[9];
            //String nameService, double areaUsed, double cost, int amountPeople,
            // String typeRent, String codeServices, String standardVilla, double swimPoolArea, int floorVilla) {

            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                villaList.add(new Villa(strings[0],
                        Double.parseDouble(strings[1]),
                        Double.parseDouble(strings[2]),
                        Integer.parseInt(strings[3]),
                        strings[4], strings[5], strings[6],
                        Double.parseDouble(strings[7]),
                        Integer.parseInt(strings[8])));
            }
            ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return villaList;
    }
    public List<House> readFileHouse(String pathFile) {
        List<House> houseList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings = new String[8];
            //String nameService, double areaUsed, double cost, int amountPeople,
            // String typeRent, String codeServices, String standardVilla, double swimPoolArea, int floorVilla) {
//String nameService, double areaUsed, double cost, int amountPeople,
// String typeRent, String codeServices, String standardHouse, int floorHouse
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
             houseList.add(new House(strings[0],Double.parseDouble(strings[1]),Double.parseDouble(strings[2]),
                        Integer.parseInt(strings[3]),strings[4],strings[5],strings[6],Integer.parseInt(strings[7])));
            }
            ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return houseList;
    }
    public List<Room> readFileRoom(String pathFile) {
            List<Room> roomList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] strings = new String[7];
            //String nameService, double areaUsed, double cost, int amountPeople,
            // String typeRent, String codeServices, String standardVilla, double swimPoolArea, int floorVilla) {

            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                roomList.add(new Room(strings[0],
                        Double.parseDouble(strings[1]),
                        Double.parseDouble(strings[2]),
                        Integer.parseInt(strings[3]),
                        strings[4], strings[5], strings[6]));
            }
            ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return roomList;
    }
}

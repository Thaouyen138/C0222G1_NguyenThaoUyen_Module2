package _case_study_module2.services.impl_interface;

import _case_study_module2.models.person.Customer;
import _case_study_module2.models.person.Employee;
import _case_study_module2.services.interface_services.IEmployeeServices;
import _case_study_module2.utils.ReadAndWriteFile;
import _case_study_module2.utils.Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeServicesImpl implements IEmployeeServices {
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Employee employee = new Employee();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public void add() {
        System.out.print("enter name employee: ");
        String name = scanner.nextLine();
        System.out.print("enter date  of birth employee: ");
        String dateBirth = Regex.regexAge();

        System.out.println("enter gender: ");
        System.out.println("1:female" + " " + "2.male");
        String gender = null;
        int choice = 0;
        boolean check = true;
        while (check) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("input wrong format");
            }
            switch (choice) {
                case 1:
                    gender = "Male";
                    check = false;
                    break;
                case 2:
                    gender = "FeMale";
                    check = false;
                    break;
            }
        }

//
//            if (gender == 1) {
//                System.out.println("female");
//            } else {
//                System.out.println("male");
//            }

        System.out.print("enter identity: ");
        String identity = scanner.nextLine();
        System.out.print("enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("enter email: ");
        String email = scanner.nextLine();
        System.out.print("enter id employee: ");
        String idEmployee = scanner.nextLine();
        System.out.println("level employee: ");
        String[] level = {"Trung cấp", "Cao đẳng", "Đại học ", "Sau đại học"};
        for (int i = 0; i < level.length; i++) {
            System.out.println(i + ": " + level[i]);
        }
        System.out.print("enter level:");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("position employee: ");
        String[] position = {"Lễ tân", "phục vụ", "chuyên viên", "giám sát", "quản lý", "giám đốc"};
        for (int i = 0; i < position.length; i++) {
            System.out.println(i + ": " + position[i]);
        }
        System.out.print("enter position: ");
        int index2 = Integer.parseInt(scanner.nextLine());
        System.out.print("enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        employee = new Employee(name, dateBirth, gender, identity, phone, email, idEmployee, level[index], position[index2], salary);
        employeeList.add(employee);
        readAndWriteFile.writeFile("src\\_case_study_module2\\data\\employee.csv",this.writeEmployeeToCSV(employeeList));
    }

    @Override
    public void edit() {
        System.out.println("enter name employee to edit:");
        String name = scanner.nextLine();
        for (Employee value : employeeList) {
            if (value.getName().equals(name)) {
                System.out.print("name employee to edit: ");
                value.setName(scanner.nextLine());
                System.out.print("date of birth employee to edit: ");
                value.setDateOfBirth(scanner.nextLine());
                System.out.print("gender to edit: ");
                value.setGender(scanner.nextLine());
                System.out.print("enter identity to edit: ");
                value.setIdentity(scanner.nextLine());
                System.out.print("enter phone to edit: ");
                value.setPhone(scanner.nextLine());
                System.out.print("enter email to edit: ");
                value.setEmail(scanner.nextLine());
                System.out.print("enter id employee to edit: ");
                value.setIdEmployee(scanner.nextLine());
                System.out.println("level employee: ");
                String[] level = {"0.Trung cấp", "1.Cao đẳng", "2.Đại học ", "3.Sau đại học"};
                for (String l : level) {
                    System.out.println(Arrays.toString(level));
                }
                System.out.print("enter level: ");
                int index = Integer.parseInt(scanner.nextLine());
                value.setLevel(level[index]);
                System.out.println("position employee: ");
                String[] position = {"0.Lễ tân", "1.phục vụ", "2.chuyên viên", "3.giám sát", "4.quản lý", "5.giám đốc"};
                for (String p : position) {
                    System.out.println(p);
                }
                System.out.print("enter position: ");
                int index2 = Integer.parseInt(scanner.nextLine());
                value.setPosition(position[index2]);
                System.out.print("enter salary: ");
                value.setSalary(Double.parseDouble(scanner.nextLine()));
            } else {
                System.err.println("Employee name does not exist in the list!");
            }
        }
    }

    @Override
    public void display() {
        employeeList=readAndWriteFile.readFileEmployee("src\\_case_study_module2\\data\\employee.csv");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    public List<String> writeEmployeeToCSV(List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee :
                employeeList) {
            stringList.add(employee.stringToCsv());
        }
        return stringList;
    }
}
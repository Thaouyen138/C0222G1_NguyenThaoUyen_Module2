package _case_study_module2.services.impl_interface;

import _case_study_module2.models.person.Employee;
import _case_study_module2.services.interface_services.IEmployeeServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeServicesImpl implements IEmployeeServices {
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Employee employee = new Employee();

    //String name, String dateOfBirth, String gender, String identity, String phone,
    // String email, String idEmployee, String level, String position, double salary) {
    @Override
    public void add() {


        System.out.print("enter name employee: ");
        String name = scanner.nextLine();
        System.out.print("enter date  of birth employee: ");
        String date = scanner.nextLine();
        System.out.print("enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("enter identity: ");
        String identity = scanner.nextLine();
        System.out.print("enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("enter email: ");
        String email = scanner.nextLine();
        System.out.print("enter id employee: ");
        String idEmployee = scanner.nextLine();
        System.out.println("level employee: ");

        //Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
        String[] level = {"Trung cấp", "Cao đẳng", "Đại học ", "Sau đại học"};
        for (int i = 0; i < level.length; i++) {
            System.out.println(i + ": " + level[i]);
        }
        System.out.print("enter level:");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("position employee: ");
        // //Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
        String position[] = {"Lễ tân", "phục vụ", "chuyên viên", "giám sát", "quản lý", "giám đốc"};
        for (int i = 0; i < position.length; i++) {
            System.out.println(i + ": " + position[i]);
        }
        System.out.print("enter position: ");
        int index2 = Integer.parseInt(scanner.nextLine());
        System.out.print("enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        employee = new Employee(name, date, gender, identity, phone, email, idEmployee, level[index], position[index2], salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("enter name employee to edit:");
        String name = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name)) {
                System.out.print("name employee to edit: ");
                employeeList.get(i).setName(scanner.nextLine());
                System.out.print("date of birth employee to edit: ");
                employeeList.get(i).setDateOfBirth(scanner.nextLine());
                System.out.print("gender to edit: ");
                employeeList.get(i).setGender(scanner.nextLine());
                System.out.print("enter identity to edit: ");
                employeeList.get(i).setIdentity(scanner.nextLine());
                System.out.print("enter phone to edit: ");
                employeeList.get(i).setPhone(scanner.nextLine());
                System.out.print("enter email to edit: ");
                employeeList.get(i).setEmail(scanner.nextLine());
                System.out.print("enter id employee to edit: ");
                employeeList.get(i).setIdEmployee(scanner.nextLine());
                System.out.println("level employee: ");

                //Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
                String[] level = {"0.Trung cấp", "1.Cao đẳng", "2.Đại học ", "3.Sau đại học"};
                for (int j = 0; j < level.length; j++) {
                    System.out.println(Arrays.toString(level));
                    break;
                }
                System.out.print("enter level: ");
                int index = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setLevel(level[index]);
                System.out.println("position employee: ");
                // //Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.
                String[] position = {"0.Lễ tân", "1.phục vụ", "2.chuyên viên", "3.giám sát", "4.quản lý", "5.giám đốc"};
                for (int k = 0; k < position.length; k++) {
                    System.out.println(Arrays.toString(position));
                    break;
                }
                System.out.print("enter position: ");
                int index2 = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setPosition(position[index2]);
                System.out.print("enter salary: ");
                employeeList.get(i).setSalary(Double.parseDouble(scanner.nextLine()));
            } else {
                System.err.println("Employee name does not exist in the list!");
            }
        }
    }

    @Override
    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}

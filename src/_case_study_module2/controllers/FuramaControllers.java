package _case_study_module2.controllers;

import _case_study_module2.services.impl_interface.CustomerServicesImpl;
import _case_study_module2.services.impl_interface.EmployeeServicesImpl;

import java.util.Scanner;

public class FuramaControllers {
    public static void main(String[] args) {
        displayMainMenu();
        CustomerServicesImpl customerServices = new CustomerServicesImpl();
        EmployeeServicesImpl employeeServices = new EmployeeServicesImpl();
    }


    public static void displayMainMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.err.println(" --------Menu-------- ");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagerment();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(6);
                    check = false;
                    break;
                default:
                    System.out.println("No choice!");
            }
        } while (check);
    }

    public static void employeeManagement() {
        EmployeeServicesImpl employeeServices = new EmployeeServicesImpl();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeServices.displayEm();
                    break;
                case 2:
                    employeeServices.addEm();
                    break;
                case 3:
                    employeeServices.editEm();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("no choice!");
            }
        } while (check);
    }

    public static void customerManagement() {
        CustomerServicesImpl customerServices = new CustomerServicesImpl();
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Display list customer");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerServices.displayCus();
                    break;
                case 2:
                    customerServices.addCus();
                    break;
                case 3:
                    customerServices.editCus();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("no choice!");
            }
        } while (check);
    }

    public static void facilityManagement() {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Edit facility");
            System.out.println("4.Return main menu");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("no choice!");
            }
        } while (check);
    }

    public static void bookingManagerment() {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new constracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    check = false;
                    break;
                default:
                    System.out.println("no choice!");
            }
        } while (check);
    }

    public static void promotionManagement() {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
//1.Display list customers use service
//2.Display list customers get voucher
//3.Return main menu
        do {
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.exit(3);
                default:
                    System.out.println("no choice!");
            }

        } while (check);
    }
}


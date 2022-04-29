package _case_study_module2.services.impl_interface;

import _case_study_module2.models.person.Customer;
import _case_study_module2.services.interface_services.ICustomerServices;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServicesImpl implements ICustomerServices {
    static Customer customer = new Customer();
    static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("enter name customer: ");
        String name = scanner.nextLine();
        System.out.print("enter date  of birth customer: ");
        String date = scanner.nextLine();
        System.out.print("enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("enter identity: ");
        String identity = scanner.nextLine();
        System.out.print("enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("enter email: ");
        String email = scanner.nextLine();
        System.out.print("enter id customer: ");
        String idCustomer = scanner.nextLine();
        System.out.println("type customer:");
        //: (Diamond, Platinium, Gold, Silver, Member
        String typeCus[] = {"Diamond", "Platinium", "Gold", "Silver", "Member"};
        for (int i = 0; i < typeCus.length; i++) {
            System.out.println(i + ": " + typeCus[i]);
        }
        System.out.print("enter type customer: ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.print("enter address: ");
        String address = scanner.nextLine();
        customer = new Customer(name, date, gender, identity, phone, email, idCustomer, typeCus[index], address);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.print("enter name customer to edit:");
        String name = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().equals(name)) {
                System.out.print("name customer to edit:");
                customerList.get(i).setName(scanner.nextLine());
                System.out.print("date of birth customer to edit:");
                customerList.get(i).setDateOfBirth(scanner.nextLine());
                System.out.print("gender to edit:");
                customerList.get(i).setGender(scanner.nextLine());
                System.out.print("enter identity to edit: ");
                customerList.get(i).setIdentity(scanner.nextLine());
                System.out.print("enter phone to edit: ");
                customerList.get(i).setPhone(scanner.nextLine());
                System.out.print("enter email to edit: ");
                customerList.get(i).setEmail(scanner.nextLine());
                System.out.print("enter id customer to edit: ");
                customerList.get(i).setIdCustomer(scanner.nextLine());
                System.out.println("type customer to edit:");
                //: (Diamond, Platinium, Gold, Silver, Member
                String typeCus[] = {"0.Diamond", "1.Platinium", "2.Gold", "3.Silver", "4.Member"};
                for (int j = 0; j < typeCus.length; i++) {
                    System.out.println(Arrays.toString(typeCus));
                    break;
                }
                System.out.print("enter type customer: ");
                int index = Integer.parseInt(scanner.nextLine());
                customerList.get(i).setTypeCustomer(typeCus[index]);
                System.out.print("enter address: ");
                customerList.get(i).setAddress(scanner.nextLine());
            } else {
                System.out.println("Customer name does not exist in the list!");
            }
        }
    }

    public void display() {
        for (Customer c : customerList
        ) {
            System.out.println(c);

        }
    }
}


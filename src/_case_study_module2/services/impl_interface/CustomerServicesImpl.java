package _case_study_module2.services.impl_interface;

import _case_study_module2.models.person.Customer;
import _case_study_module2.services.interface_services.ICustomerServices;
import _case_study_module2.utils.ReadAndWriteFile;
import _case_study_module2.utils.Regex;

import java.util.*;

public class CustomerServicesImpl implements ICustomerServices {
    static Customer customer = new Customer();
    static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    @Override
    public void add() {
        System.out.print("enter name customer: ");
        String name=scanner.nextLine();
        System.out.print("enter date  of birth employee: ");
        String dateBirth = Regex.regexAge();

        System.out.println("enter gender: ");
        System.out.println("1:female"+" "+"2.male");
        String gender = null;
        int choice = 0;
        boolean check = true;
        while (check){
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("input wrong format");
            }
            switch (choice){
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
        System.out.print("enter identity: ");
        String identity = scanner.nextLine();
        System.out.print("enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("enter email: ");
        String email = scanner.nextLine();
        System.out.print("enter id customer: ");
        String idCustomer = scanner.nextLine();
        System.out.println("type customer:");
        String typeCus[] = {"Diamond", "Platinium", "Gold", "Silver", "Member"};
        for (int i = 0; i < typeCus.length; i++) {
            System.out.println(i + ": " + typeCus[i]);
        }
        System.out.print("enter type customer: ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.print("enter address: ");
        String address = scanner.nextLine();
        customer = new Customer(name, dateBirth, gender, identity, phone, email, idCustomer, typeCus[index], address);
        customerList.add(customer);
        readAndWriteFile.writeFile("src\\_case_study_module2\\data\\customer.csv",this.writeCustomerToCSV(customerList));
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
                String[] typeCus = {"0.Diamond", "1.Platinium", "2.Gold", "3.Silver", "4.Member"};
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
        customerList = readAndWriteFile.readFileCustomer("src\\_case_study_module2\\data\\customer.csv");
        for (Customer c : customerList
        ) {
            System.out.println(c);
        }

    }

    public  List<String> writeCustomerToCSV(List<Customer> customerList){
        List<String> stringList = new ArrayList<>();
        for (Customer customer:
                customerList) {
            stringList.add(customer.stringToCsv());
        }
        return stringList;
        // chuyển đối mang đối tượng thành mảng chuổi
    }
}


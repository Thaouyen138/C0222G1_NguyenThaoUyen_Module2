package _demo_anh_chien2;

import java.util.Arrays;
import java.util.Scanner;

public class
StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        boolean check = true;

        System.out.println("enter amount elemnt array:");
        int size = Integer.parseInt(scanner.nextLine());
        Student students[] = new Student[size];

        do {
            System.out.println("Display menu\n" +
                    "1.Dislay list student:\n" +
                    "2.Add new student\n" +
                    "3.Delete student:\n" +
                    "0.Exit\n" +
                    "Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 2:


//        if (array[size] == null) {
//        }
//        student1.setName(name);
//        student1.setAge(age);
//        student1.setAddress(add);
//        student1.setPoint(point);


                    for (int i = 0; i < size; i++) {

                        System.out.print("enter name student:");
                        String name = scanner.nextLine();
                        System.out.print("enter age student:");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("enter add student:");
                        String add = scanner.nextLine();
                        System.out.print("enter point:");
                        float point = Float.parseFloat(scanner.nextLine());
                        if (students[i] == null) {
                            students[i] = new Student(name, age, add, point);
                        }


                    }


                    break;
                case 3:
                    System.out.println("Enter student to delete:");
                    String name = scanner.nextLine();

                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getName().equals(name)){
                            for (int j=i;i<students.length-1;j++){
                                students[j]=students[j+1];
                            }students[students.length-1]=null;
                        }


                    }
                    System.out.println(Arrays.toString(students));
break;


                case 0:
                    check=false;
                    break;
                default:
                    System.out.println("no choice!");
            }
        }while (check);
    }
}
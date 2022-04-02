package _03_array_and_method_in_java.practice;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"Uyen","Nhi","Ngoc","Minh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name student:");
        String nameStudent = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameStudent)) {

                System.out.println("Position of the student in the list " + nameStudent + " is: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found" + nameStudent + " in the list.");
        }
    }
}

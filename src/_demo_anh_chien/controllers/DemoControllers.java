package _demo_anh_chien.controllers;

import _demo_anh_chien.services.StudentImpl;

import java.util.Scanner;

public class DemoControllers {

    //Lưu trữ và hiển thị danh sách Student (Lưu bằng mảng).
    //Thêm mới một Student -> Nhập thông tin từ bàn phím.
    //Xóa 1 Student ra khỏi danh sách.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentImpl student = new StudentImpl();
        boolean check = true;
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
                    student.display();
                    break;
                case 2:
                    student.addStudent();
                    break;
                case 3:student.delete();
                break;
                case 0:
                    check=false;
                default:
                    System.out.println("no choice");
            }
        } while (check);
    }
}

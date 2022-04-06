package _demo_anh_chien.services;

import _demo_anh_chien.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements IStudent {
    List<Student> studentArrayList = new ArrayList<>();
Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    @Override
    public void addStudent() {
        System.out.print("enter name student:");
        String name=scanner.nextLine();
        System.out.print("enter age student:");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.print("enter address student:");
        String add=scanner.nextLine();
        System.out.print("enter point student:");
        float point=Float.parseFloat(scanner.nextLine());
        studentArrayList.add(new Student(name,age,add,point));
    }

    @Override
    public void delete() {
        System.out.println("enter name student to delelte");
        String name=scanner.nextLine();
        for(int i=0;i<studentArrayList.size();i++){
        if ((studentArrayList.get(i).getName()).contains(name)){
        studentArrayList.remove(i);
        display();
        }
        }
    }
}

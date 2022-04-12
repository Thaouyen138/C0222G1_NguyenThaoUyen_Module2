package _exercise_casting;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      Person person=new Student();
      Person person1=new Teacher();
      Person[] person2=new Person[2];
//      person2[0]=person;
//      person2[1]=person1;
//      if (person1 instanceof Teacher){
//          Teacher teacher=(Teacher)person1;
//      }
        boolean check = true;
        do {
            System.out.println("-----menu-----");
            System.out.println("1.display person");
            System.out.println("2.add new person");
            System.out.println("3.delete person");
            System.out.println("0.exit");
            System.out.println("Enter your choice!");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayStudnet();
                case 2:
                    addNewPerson();
                    break;
                case 3:
                    deletePerson();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }
    public  static void displayStudent(){
        Person person=new Student();
        Person[] person2=new Person[2];
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("---------menu-------");
            System.out.println("1.display student:");
            System.out.println("2.display teacher:");
            System.out.println("0.return main menu:");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (Person student:person2){
                        if (student instanceof Student){
                            System.out.println(student);
                        }


                    }
                case 2:
                    addNewTeacher();
                    break;
                case 0:
                    check=false;

                default:
                    System.out.println("no choice!");
            }
        } while (check);
    }

    public static void addNewPerson() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("---------menu-------");
            System.out.println("1.add new student:");
            System.out.println("2.add new teacher:");
            System.out.println("0.return main menu:");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    addNewTeacher();
                    break;
                case 0:
                  check=false;

                default:
                    System.out.println("no choice!");
            }
        } while (check);
    }

    public static void addNewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount student to add:");
        int size = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter name student:");
            String name = scanner.nextLine();
            System.out.println("Enter age student:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("enter gender:");
            String gender = scanner.nextLine();
            System.out.println("enter point :");
            int point = Integer.parseInt(scanner.nextLine());
//            if (students[i] == null) {
//                students[i] = new Student(name, age, gender, point);

            }
        }
//    }

    public static void addNewTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount teacher to add:");
        int size = Integer.parseInt(scanner.nextLine());
        Teacher[] teachers = new Teacher[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter name teacher:");
            String name = scanner.nextLine();
            System.out.println("Enter age teacher:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("enter gender:");
            String gender = scanner.nextLine();
            System.out.println("enter salary :");
            int salary = Integer.parseInt(scanner.nextLine());
            if (teachers[i] == null) {
                teachers[i] = new Teacher(name, age, gender, salary);
            }
        }
    }

    public static void deletePerson() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("---------menu-------");
            System.out.println("1.delete student:");
            System.out.println("2.delete teacher:");
            System.out.println("0.return main menu:");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    deleteStudent();
                    break;
                case 2:
                    deleteTeacher();
                    break;
                case 0:
                   check=false;
                   break;
                default:
                    System.out.println("no choice!");
            }
        } while (check);
    }

    public static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount student to add:");
        int size = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[size];
        System.out.println("Enter student to delete:");
        String name = scanner.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                for (int j = i; i < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
            }
        }
    }

    public static void deleteTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount teacher to add:");
        int size = Integer.parseInt(scanner.nextLine());
        Teacher[] teachers = new Teacher[size];
        System.out.println("Enter teacher to delete:");
        String name = scanner.nextLine();

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getName().equals(name)) {
                for (int j = i; i < teachers.length - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teachers[teachers.length - 1] = null;
            }
        }
    }
    public static void displayStudnet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount student to add:");
        int size = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[size];
        for (Student student:students){
            System.out.println(student);
        }
    }
}
//    public static void Display() {
//        Scanner scanner = new Scanner(System.in);
//        boolean check = true;
//        Student student = new Student();
//        Teacher teacher = new Teacher();
//        Person[] person = new Person[2];
//        person[0] = student;
//        person[1] = teacher;
//        do {
//            System.out.println("----------menu---------");
//            System.out.println("1.display student");
//            System.out.println("2.display teacher");
//            System.out.println("---Enter your choice---");
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    for (Person teacher1 : person
//                    ) {
//                        System.out.println(teacher1);
//                    }
//            }
//        }while ()
//    }


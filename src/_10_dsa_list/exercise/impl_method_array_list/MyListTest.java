package _10_dsa_list.exercise.impl_method_array_list;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "uyen");
        Student student2 = new Student(2, "uyen2");
        Student student3 = new Student(3, "uyen3");
        Student student4 = new Student(4, "uyen4");
        Student student5 = new Student(5, "uyen5");
        Student student6=new Student(6,"uyen6");
        MyList<Student> studentMyList=new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
        studentMyList.add(2,student6);
        for (int i=0;i<studentMyList.size();i++){
            Student student=(Student)studentMyList.elements[i];
            System.out.print(student.getId());
            System.out.println(student.getName());
        }
        System.out.print("Size student list: "+studentMyList.size());

    }
}

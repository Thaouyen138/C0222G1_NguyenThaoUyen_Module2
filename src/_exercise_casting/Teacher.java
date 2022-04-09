package _exercise_casting;

public class Teacher extends Person{
    private int salary;

    public Teacher() {
    }

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary=" + salary +
                '}';
    }
}

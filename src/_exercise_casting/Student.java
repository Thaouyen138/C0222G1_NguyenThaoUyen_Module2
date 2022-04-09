package _exercise_casting;

public class Student extends Person {
    private  int point;

    public Student() {
    }

    public Student(int point) {
        this.point = point;
    }

    public Student(String name, int age, String gender, int point) {
        super(name, age, gender);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() +
                "point=" + point +
                '}';
    }
}

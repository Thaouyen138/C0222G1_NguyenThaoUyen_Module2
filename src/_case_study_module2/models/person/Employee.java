package _case_study_module2.models.person;

import _case_study_module2.models.person.Person;

public class Employee extends Person {
    private String idEmployee;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String idEmployee, String level, String position, double salary) {
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String gender, String identity, String phone,
                    String email, String idEmployee, String level, String position, double salary) {
        super(name, dateOfBirth, gender, identity, phone, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "idEmployee='" + idEmployee + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary+'\''
                ;
    }
    //(String name, String dateOfBirth, String gender, String identity, String phone,
    //                    String email, String idEmployee, String level, String position, double salary) {
    public String stringToCsv(){
        return getName()+","+getDateOfBirth()+","+getGender()+","+getIdentity()+","+getPhone()+","+getEmail()+","+getIdEmployee()+","+getLevel()+","+getPosition()+","+getSalary();
    }
}

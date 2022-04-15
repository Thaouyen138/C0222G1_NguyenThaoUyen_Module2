package _11_dsa_stack_queue.exercise.demerging_queue;

public class Manager {
    //Mỗi bản ghi gồm các trường: Họ tên, giới tính, ngày tháng năm sinh, ...
    String name;
    String gender;
    String birth;

    public Manager() {
    }

    public Manager(String name, String gender, String birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}


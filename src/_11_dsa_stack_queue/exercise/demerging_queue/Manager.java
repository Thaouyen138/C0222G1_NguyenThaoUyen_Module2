package _11_dsa_stack_queue.exercise.demerging_queue;

public class Manager implements Comparable<Manager> {
    String name;
    Boolean gender = true;
    int birth;

    public Manager() {
    }

    public Manager(String name, Boolean gender, int birth) {
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public int  getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
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

    @Override
    public int compareTo(Manager o) {
        if (this.getBirth() > (o.getBirth())) {
            return 1;
        } else if (this.getBirth()<o.getBirth()) {
            return -1;
        } else {
            return 0;
        }
    }
}


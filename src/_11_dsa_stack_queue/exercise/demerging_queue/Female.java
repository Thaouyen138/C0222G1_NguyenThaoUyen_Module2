package _11_dsa_stack_queue.exercise.demerging_queue;

public class Female extends  Manager {

    private boolean gender = true;

    public Female() {
    }

    public Female(boolean gender) {
        this.gender = gender;
    }

    public Female(String name, Boolean gender, int birth, boolean gender1) {
        super(name, gender, birth);
        this.gender = gender1;
    }

    public boolean isGender() {

        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Female{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                '}';
    }
}
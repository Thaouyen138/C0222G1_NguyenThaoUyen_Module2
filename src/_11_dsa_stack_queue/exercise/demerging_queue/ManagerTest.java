package _11_dsa_stack_queue.exercise.demerging_queue;

import java.lang.reflect.Array;
import java.util.*;

public class ManagerTest {
    public static void main(String[] args) {
        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager("uyen", true, 24));
        managerList.add(new Manager("hao", false, 26));
        managerList.add(new Manager("trug", false, 14));
        managerList.add(new Manager("hoang", false, 30));
        managerList.add(new Manager("mai", true, 27));
        Collections.sort(managerList);

        Queue<Manager> female = new LinkedList<>();
        Queue<Manager> male = new LinkedList<>();
        for (Manager m2 : managerList) {
            if (m2.getGender()) {
                female.add(m2);
            } else {
                male.add(m2);
            }
        }
        for (int i = 0; i < managerList.size(); i++) {
            managerList.set(0,female.poll());
            managerList.set(1,female.poll());
            managerList.set(2,male.poll());
            managerList.set(3,male.poll());
            managerList.set(4,male.poll());
            break;
        }

        for (Manager m:managerList){
            System.out.println(m);
        }


    }
}

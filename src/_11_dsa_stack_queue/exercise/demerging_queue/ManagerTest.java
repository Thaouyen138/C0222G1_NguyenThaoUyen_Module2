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

        Queue<Manager> Female = new LinkedList<>();
        Queue<Manager> Male = new LinkedList<>();
        for (Manager m2 : managerList) {
            if (m2.getGender()) {
                Female.add(m2);
            } else {
                Male.add(m2);
            }
        }
        for (int i = 0; i < managerList.size(); i++) {
            managerList.set(0,Female.poll());
            managerList.set(1,Female.poll());
            managerList.set(2,Male.poll());
            managerList.set(3,Male.poll());
            managerList.set(4,Male.poll());
            break;
        }

        for (Manager m:managerList){
            System.out.println(m);
        }


    }
}

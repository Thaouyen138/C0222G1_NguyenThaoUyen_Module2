package _11_dsa_stack_queue.exercise.demerging_queue;

import java.lang.reflect.Array;
import java.util.*;

public class ManagerTest {
    public static void main(String[] args) {
        Queue<Manager> Female = new LinkedList<>();
        Queue<Manager> Male = new LinkedList<>();
        Manager manager[] = new Manager[5];
        manager[0] = new Manager("uyen", true, 13);
        manager[1] = new Manager("uyen1", true, 17);
        manager[2] = new Manager("uyen2", false, 15);
        manager[3] = new Manager("uyen3", true, 21);
        manager[4] = new Manager("uyen4", false, 19);

        System.out.println("danh sách được sắp xếp là:");

        for (Manager m : manager) {
            System.out.println(m.toString());
            Arrays.sort(manager);
        }

        for (Manager m2:manager){
            if (m2.getGender()){
                Female.add(m2);
            }else {
                Male.add(m2);
            }
        }
        List<Manager> managerList=new ArrayList<>();

        while (Female.size()>0){
           managerList.add(Female.remove());
        }
        while (Male.size()>0){
            managerList.add(Male.remove());
        }
        System.out.println("danh sash sau khi cần đưuọc sắp xếp la:");
        Collections.sort(managerList);
        for (Manager m3:managerList){
            System.out.println(m3.toString());


        }

    }
}

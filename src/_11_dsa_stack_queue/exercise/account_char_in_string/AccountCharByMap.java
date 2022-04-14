package _11_dsa_stack_queue.exercise.account_char_in_string;

import java.util.TreeMap;

public class AccountCharByMap {
    public static void main(String[] args) {
        String string = "hellouyennek";
        System.out.println(string.toUpperCase());
        TreeMap<Integer, String> treeMap = new TreeMap();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
//            treeMap.containsKey();
            count++;
        }
        System.out.println(count);


    }
}

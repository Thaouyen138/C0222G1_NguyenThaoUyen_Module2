package _11_dsa_stack_queue.exercise.account_char_in_string;

import java.util.TreeMap;

public class AccountCharByMap {
    public static void main(String[] args) {
        String string = "hellouyennek";
        System.out.println(string.toUpperCase());
        TreeMap<Character, Integer> treeMap = new TreeMap();

        for (int i = 0; i < string.length(); i++) {
            if (!treeMap.containsKey(string.charAt(i))) {
                treeMap.put(string.charAt(i),1);

            } else {
                treeMap.put(string.charAt(i),treeMap.get(string.charAt(i))+1);
            }
            }
        System.out.println(treeMap);

        }
    }

package test_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestLoop {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 5);
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 10; i = i + 2) {
//            System.out.println(i);
//        }
//        int[] words = new int[10];
//        words[0] =1;
//        words[1] =1;
//        words[2] = 2;
//        System.out.println(words.length + "  " + words[0]);
//
//        System.out.println( Arrays.toString(words)); return arr;

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

    }
    }
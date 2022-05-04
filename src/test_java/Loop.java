package test_java;

import java.util.ArrayList;
import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        forLoop();
        forEach();
        arrayTest();
        stringTest();
    }

    public static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("---bye bye---");
    }

    public static void doWhileLoop() {
        int i = 3;
        do {
            System.out.println(i);
            i++;
        } while (i < 7);
        System.out.println("---bye bye---");

    }

    public static void forLoop() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---bye bye---");

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("---bye bye---");


    }

    public static void forEach() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
            ArrayList<String> cars1 = new ArrayList<String>();
            cars1.add("Volvo");
            cars1.add("BMW");
        }
        System.out.println("---bye bye---");

    }

    public static void arrayTest() {

        int[] words = new int[10];
        words[0] = 1;
        words[1] = 1;
        words[2] = 2;
        System.out.println(words.length);
        System.out.println(Arrays.toString(words));
        System.out.println("---bye bye---");

    }

    public static void stringTest() {
        String s = "hello";
        char[] chars = s.toCharArray();
        for (char c : chars
        ) {
            System.out.println(c);

        }
        System.out.println(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println("---bye bye---");

    }

}

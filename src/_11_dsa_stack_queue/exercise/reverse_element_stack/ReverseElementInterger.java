package _11_dsa_stack_queue.exercise.reverse_element_stack;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElementInterger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.push(arr[i]));
        }
        System.out.println("");
        System.out.print(("arr reverse:"));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.pop());


        }
    }
}
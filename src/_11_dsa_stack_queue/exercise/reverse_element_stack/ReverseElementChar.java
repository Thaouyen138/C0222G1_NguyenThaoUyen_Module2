package _11_dsa_stack_queue.exercise.reverse_element_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElementChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "hello uyen nek";
        char[] chars = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(stack.push(chars[i]));
        }
        System.out.println("");
        for (int i = 0; i < chars.length; i++) {

            System.out.print(stack.pop());
        }
    }
}


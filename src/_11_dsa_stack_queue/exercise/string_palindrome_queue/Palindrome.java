package _11_dsa_stack_queue.exercise.string_palindrome_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string:");
        String string = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i =  string.length()-1;i>=0 ;i--) {
            queue.add(string.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (string.equals(reverseString)) {
            System.out.println("String Palindrome");
        } else {
            System.out.println("String isn't Palindrome");
        }

    }
}
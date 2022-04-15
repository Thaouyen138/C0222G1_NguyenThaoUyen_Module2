package _11_dsa_stack_queue.exercise.convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number :");
        int num=Integer.parseInt(scanner.nextLine());
        Stack stack=new Stack();
        while (num!=0){
           stack.push(num%2);
            num=num/2;
        }
        System.out.println(stack);
        String str="";
       while (!stack.isEmpty()){
           str+=stack.pop();
       }
        System.out.println(str);
    }
}

package _11_dsa_stack_queue.exercise.check_symbol_using_stack;

import java.util.Stack;

public class CheckSymbol {
    public static void main(String[] args) {
        Stack symStack = new Stack<>();
        String str = "s * (s – a) * (s – b * (s – c)";
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                symStack.push(str.charAt(i));
                if (str.charAt(i) == ')') {
                    if (symStack.isEmpty()) {
                    }
                    flag = false;
                    break;
                } else {

                }
            }
        }
        System.out.println(symStack);
    }
    }
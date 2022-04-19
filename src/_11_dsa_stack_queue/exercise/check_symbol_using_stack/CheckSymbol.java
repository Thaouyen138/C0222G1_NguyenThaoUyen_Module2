package _11_dsa_stack_queue.exercise.check_symbol_using_stack;

import java.util.Stack;

public class CheckSymbol {
        public static void main(String[] args) {
            Stack symStack = new Stack<>();
            Stack symStack2 = new Stack<>();
            String str =  "s * (s – a) * (s – b )* (s – c)";
            boolean flag = true;
            for(int i = 0; i < str.length() ; i++){

                if(str.charAt(i)=='('){
                    symStack.push(str.charAt(i));
                }

                if(str.charAt(i) == ')'){
                        symStack2.push(str.charAt(i));
                    }

            }
            System.out.println(symStack);
            System.out.println(symStack2);
            if(symStack.size() == symStack2.size()){
                System.out.println("WELL");
            }else{
                System.out.println("NOT WELL");
            }
        }

    }

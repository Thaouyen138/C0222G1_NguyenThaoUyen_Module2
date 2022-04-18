package _13_search_algorithm.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class StringAscending {

       public static void findStringAscending() {
           Scanner scanner=new Scanner(System.in);
           System.out.println("enter string");
           String string=scanner.nextLine();
           LinkedList<Character> list = new LinkedList<>();
           list.add(string.charAt(0));
           for (int i = 0; i < string.length(); i++) {
               if (list.getLast() < string.charAt(i)) {
                   list.add(string.charAt(i));

               }
           }
           for (Character c : list) {
               System.out.print(c);
           }
       }
    public static void main(String[] args) {
           findStringAscending();

        }
    }


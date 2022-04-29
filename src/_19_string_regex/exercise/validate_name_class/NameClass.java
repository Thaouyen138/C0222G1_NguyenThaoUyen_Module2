package _19_string_regex.exercise.validate_name_class;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name class: ");
        String nameClass = scanner.nextLine();
        String regexNameClass = "(A|C|P)[0-9]{4}(G|H|I|K|L|M)";
        boolean checkName = Pattern.matches(regexNameClass, nameClass);
        System.out.println(checkName);
    }
}
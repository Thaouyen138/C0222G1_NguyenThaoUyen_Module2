package _19_string_regex.exercise.validate_telephone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Telephone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter telephone: ");
        String tel = scanner.nextLine();
        String regexTel = "^\\(\\d{2}\\)-\\(0\\d+\\)$";
        boolean checkTel = Pattern.matches(regexTel, tel);
        System.out.println(checkTel);
    }
}


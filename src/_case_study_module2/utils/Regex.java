package _case_study_module2.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_AGE = "^(((0[1-9]|[12]\\d|3[01])/((0[13578])|(1[02])))|((0[1-9]|[12]\\d|30)/((0[2469])|11)))/((19[4-9]\\d)|200[0-3])$";

    public static String regexStr(String temp, String regex, String error) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexAge() {
        Scanner scanner = new Scanner(System.in);
        String temp = null;
        boolean check = true;
        while (check) {
            try {
                temp = scanner.nextLine();
                if (Pattern.matches(REGEX_AGE, temp)) {
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter);
                    LocalDate now = LocalDate.now();
                    now.format(dateTimeFormatter);

                    int current = Period.between(age, now).getYears();
                    if (current > 18 && current < 100) {
                        check = false;
                        break;
                    } else {
                        throw new AgeException("Tuổi phải lớn hơn 0 và nhỏ hơn 18");
                    }

                } else {
                    throw new AgeException("Bạn đã nhập sai định dạng, tuổi phải có dạng dd/mm/YYYY");
                }
            } catch (Exception e) {
                System.out.println("sai định dạng");
                System.out.println("enter day of birth: ");
            }
        }
        return temp;
    }

}

package test_java;

import java.util.*;

public class Date {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        System.out.println("ngay giờ hiện tại: " + date);
        System.out.println("ngày: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("tháng: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("năm: " + calendar.get(Calendar.YEAR));
        System.out.println("Giờ hiện tại (0-12): " + calendar.get(Calendar.HOUR));
        System.out.println("Giờ hiện tại (0-24h): " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("phút: " + calendar.get(Calendar.MINUTE));
        System.out.println("giây: " + calendar.get(Calendar.SECOND));
    }
}


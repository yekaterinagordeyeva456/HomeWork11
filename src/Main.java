import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task3() {
        System.out.println("Задача 3:");
        deliveryBankCard();
    }

    public static void deliveryBankCard() {
        int deliveryDistance = 150;
        int deliveryDate = deliveryDate(deliveryDistance);
        if (deliveryDate >0) {
            System.out.println("Потребуется дней: " + deliveryDate);
        } else {
            System.out.println("достаки нет");
        }
    }

    public static int deliveryDate(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance >= 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        }else{
            return 0;
        }
    }

    public static void task2() {
        System.out.println("Задача 2:");
        clientOS();
    }

    public static void clientOS() {
        String osName = "Android";
        int clientDeviceYear = 2023;
        int clientOS = getClientOS(osName);
        if (clientOS == 0 && clientDeviceYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке: ");
        } else if (clientOS == 1 && clientDeviceYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ");
        } else {
            System.out.println("Установите обычную версию приложения по ссылке: ");
        }
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void task1() {
        System.out.println("Задача 1: ");
        leapYear();
    }

    public static void leapYear() {
        int year = 2024;
        if (isYearLeap(year)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static boolean isYearLeap(int year) {
        boolean a = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        return a;
    }
}

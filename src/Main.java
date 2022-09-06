import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int year = 2015;
        printMessageLeapYear(isLeap(year), year);

        int clientOs = 0;
        printMessageAboutAppForOs(clientOs, year);

        int deliveryDistance = 50;
        int days = calculateDeliveryDays(deliveryDistance);
        printMessageDeliveryDays(days);
    }

    //Задание 1
    public static boolean isLeap (int year) {
        if (year % 4 == 0 && year %100 != 0 || year %400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printMessageLeapYear (boolean isLeap, int year) {
        if (isLeap) {
            System.out.printf("Год %s является високосным\n", year);
        } else {
            System.out.printf("Год %s не является високосным\n", year);
        }
    }

    //Задание 2
    public static void printMessageAboutAppForOs (int clientOs, int year) {
        if (clientOs !=0 && clientOs !=1 || year < 2008) {
            throw new IllegalArgumentException ("Введите корректные данные");
        }
        String message = "Установите обычную версию приложения для Android.";
            if (clientOs == 0) {
                message = message.replace("Android", "iOS");
            }
            if (year < 2015) {
                message = message.replace("обычную", "облегчённую");
            }
        System.out.println(message);
    }

    //Задание 3
    public static int calculateDeliveryDays (int distance) {
        if (distance > 0 && distance < 20) {
            return 1;
        } else if (distance >= 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        } else {
            throw new IllegalArgumentException("Доставка на данное расстояние не осуществляется");
    }
    }

    public static void printMessageDeliveryDays (int days) {
        System.out.printf("Потребуется дней: %s", days);
    }
}

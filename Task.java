import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class Task {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите число. Для выхода из программы введите стоп.");
        while (true) {
            try {
                String s = scan2.nextLine();
                if (s.equalsIgnoreCase("стоп")) {
                    break;
                }
                double number = Double.parseDouble(s);
                if (number > 7) {
                    System.out.println("Привет");
                    break;
                } else {
                    System.out.println("Пожалуйста, введите одно число больше 7");
                }
            } catch (IllegalArgumentException exp) {
                System.out.println("Пожалуйста, введите только одно число");
            }
        }
    }
}


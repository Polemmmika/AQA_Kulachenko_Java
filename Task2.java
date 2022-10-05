import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scan1.nextLine();
        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else if (name.equals("")) {
            System.out.println("Пожалуйста, введите что-нибудь");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

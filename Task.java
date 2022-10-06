import java.util.Scanner;
import java.lang.IllegalArgumentException;
import java.util.Arrays;
import java.lang.Math;


public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("Выберите номер задания: 1. Больше 7. 2. Совпадает с Вячеслав. 3. Кратно 3. 4. Выйти из программы.");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Введите число больше 7. Для выхода введите q.");
                case1();
            }
            if (choice == 2) {
                System.out.println("Введите имя. Для выхода введите q.");
                case2();
            }
            if (choice == 3) {
                case3();
            }
            if (choice == 4) {
                b = false;
                break;
            }
        }
    }

    public static void case1() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                String s = scan.nextLine();
                if (s.equalsIgnoreCase("q")) {
                    break;
                }
                double number = Double.parseDouble(s);
                if (number > 7) {
                    System.out.println("Привет");
                    break;
                } else {
                    System.out.println("Нужно число больше 7");
                }
            } catch (IllegalArgumentException exp) {
                System.out.println("Введите только число");
            }
        }
    }

    public static void case2() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        while (true) {
            try {
                if (name.equalsIgnoreCase("Вячеслав")) {
                    System.out.println("Привет, Вячеслав");
                    break;
                } else if (name.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Нет такого имени, попробуйте еще раз");
                    name = scan.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Нет такого имени, попробуйте еще раз");
            }
        }
    }

    public static void case3() {
        Scanner scan = new Scanner(System.in);
        double[] randomArray;
        int length = getTheLength();
        double min = getTheRange("min");
        double max = getTheRange("max");
        while (min >= max) {
            System.out.println("Максимальный элемент должен быть больше минимального, попробуйте еще раз:");
            max = getTheRange("max");
        }
        randomArray = fillInTheArray(length, min, max);
        System.out.println("Массив: " + Arrays.toString(randomArray));
        System.out.print("Элементы, кратные 3: ");
        int c = 0;
        for (double i : randomArray) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                c++;
            }
        }
        System.out.println("");
        if (c == 0) {
            System.out.println("таких элементов нет");
        }
    }

    public static int getTheLength() {
        System.out.println("Задайте длину массива:");
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                String l = scan.nextLine();
                double length = Double.parseDouble(l);
                while (length < 1) {
                    System.out.println("Нужно целое положительное число, попробуйте еще раз:");
                    length = scan.nextDouble();
                }
                return (int) Math.round(length);
            } catch (Exception e) {
                System.out.println("Нужно целое положительное число, попробуйте еще раз:");
            }
        }
    }

    public static double getTheRange(String a) {
        if (a.equals("min")) {
            System.out.println("Задайте минимальный элемент массива:");
        } else {
            System.out.println("Задайте максимальный элемент массива:");
        }
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                String m = scan.nextLine();
                double n = Double.parseDouble(m);
                return n;
            } catch (Exception e) {
                System.out.println("Нужно число, повторите:");
            }
        }
    }

    public static double[] fillInTheArray(int length, double min, double max) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) (Math.round(Math.random() * (max - min) + min));
        }
        return array;
    }
}
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Task3 {

    public static void main(String[] args) {
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
        if (c == 0) {
            System.out.print("таких элементов нет");
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
                    System.out.println("Введите целое положительное число");
                    length = scan.nextDouble();
                }
                return (int) Math.round(length);
            } catch (Exception e) {
                System.out.println("Введите целое положительное число");
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
                System.out.println("Введите одно число");
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

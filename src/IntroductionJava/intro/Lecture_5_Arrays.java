package IntroductionJava.intro;

import java.util.Random;
import java.util.Scanner;

       /* Задать с клавиатуры размер массива (в диапазоне [1; 100]):

        - заполнить его числами случайным образом (в диапазоне [-50.00; 50.00])
        - найти минимальный элемент массива
        - найти максимальный элемент массива
        - найти среднее арифметическое элементов массива*/

public class Lecture_5_Arrays {
    public static void main(String[] args) {
        int sizeArr = 0;                // размер массива с клавиатуры.
        double elementSum = 0;          // сумма элементов массива.
        System.out.println("Привет! Сегодня создадим массив.");
        System.out.println("Введи размер массива.");
        System.out.println("Это должно быть целое число от 1 до 100!");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt())
                sizeArr = scanner.nextInt();
            if (sizeArr > 0 && sizeArr <= 100) {
                break;
            } else
                System.out.println("Введено не целое число или оно выходит за диапазон значений!Пробуй еще!");
        }
        Random random = new Random();
        double[] array = new double[sizeArr];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(-50.00, 50.00);
            elementSum += array[i];
        }
        // минимальное значение.
        double min = array[0];
        // максимальное значение.
        double max = array[0];
        // среднее арифметическое элементов.
        double average = elementSum / array.length;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.printf("""
                Минимальный элемент массива: %.2f
                Максимальный элемент массива: %.2f
                Среднее арифметическое элементов массива: %.2f""", min, max, average);
    }
}

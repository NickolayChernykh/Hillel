package IntroductionJava.intro;

import java.util.Scanner;

/*
Найти сумму всех цифр целочисленного массива (числа только положительные).
 Например, если дан массив [12, 104, 81],
то сумма всех его цифр будет равна 1 + 2 + 1 + 0 + 4 + 8 + 1 = 17.
*/
public class Lecture_6_Arrays {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Будет создан массив чисел. Введи 3 целых числа.");
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            int num = array[i];
            while (num != 0) {
                sum += num % 10; // последняя цифра элемента
                num /= 10;       // убрать последнюю цифру элемента
            }
        }
        System.out.printf("""
                Элемент №1 = %d
                Элемент №2 = %d
                Элемент №3 = %d
                Сумма цифр элементов в массиве = %d""", array[0], array[1], array[2], sum);

    }
}








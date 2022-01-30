package IntroductionJava.intro;

import java.util.Scanner;

/*
*  Написать консольный калькулятор с использованием методов (под каждую задачу написать метод):
        -  Необходимо ввести с консоли 2 числа (можно целых).
        -  По сути метод должен быть один - просто использовать его 2 раза для ввода каждого числа
        -  Ввести операцию (+, -, *, /)
        -  Произвести операцию над двумя числами
        П.С. Ну и вывести на консоль результат операции:)
*/
public class Lecture_8_ConsoleCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number_1 = getNumber();
        int number_2 = getNumber();
        char operator = getOperation();

        int result = calculate(number_1, number_2, operator);
        System.out.println("Результат = " + result);

    }
    public static int calculate(int number_1, int number_2, char operator) {
        int calc = 0;
        switch (operator) {
            case '+' -> calc = number_1 + number_2;
            case '-' -> calc = (number_1) - (number_2);
            case '/' -> {
                if (number_2 == 0) {
                    System.out.println("Деление на \"0\" не возможно!");
                } else calc = number_1 / number_2;
            }
            case '*' -> calc = number_1 * number_2;
            default -> System.out.println("Недопустимая операция!");
        }
        return calc;
    }
    public static char getOperation() {
        System.out.print("Введи операцию: ");
        return scanner.next().charAt(0);
    }
    public static int getNumber() {
        System.out.print("Введи число: ");

        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.print("Введено не целое число!Пробуй еще! ");
                scanner.next();
            }
        }
    }
}


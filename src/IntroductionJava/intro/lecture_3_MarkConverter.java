package IntroductionJava.intro;
import java.util.Scanner;
/*
    Ввести с консоли оценку в 12-бальной шкале и вывести на консоль её аналог в 5-бальной.
        Возьмем за правило что:
        12,11,10 = 5
        9,8,7 = 4
        6,5,4 = 3
        3,2,1 = 2
    P.S. Проверять корректность вводимой оценки на диапазон (от 1 до 12) и на вводимый тип
*/
public class lecture_3_MarkConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи оценку по 12 - ти бальной шкале!!");
        System.out.println("Это должно быть целое число от 1 до 12!");
               if (sc.hasNextInt()) {
                   switch (sc.nextInt()) {
                       case 1:
                       case 2:
                       case 3:
                           System.out.println("Твоя оценка по 5 - ти бальной шкале:  \"2\" ");
                           break;
                       case 4:
                       case 5:
                       case 6:
                           System.out.println("Твоя оценка по 5 - ти бальной шкале:  \"3\" ");
                           break;
                       case 7:
                       case 8:
                       case 9:
                           System.out.println("Твоя оценка по 5 - ти бальной шкале:  \"4\" ");
                           break;
                       case 10:
                       case 11:
                       case 12:
                           System.out.println("Твоя оценка по 5 - ти бальной шкале:  \"5\" ");
                           break;
                       default:
                           System.out.println("Таких оценок нет! Читай условие!");
                   }
               } else
            System.out.println("Нужно ввести число, согласно условия.");
    }
}


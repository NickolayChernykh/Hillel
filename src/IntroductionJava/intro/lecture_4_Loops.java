package IntroductionJava.intro;


import java.util.Scanner;

/*Человек подтягивается лесенкой: 1 раз, 2 раза, 3 раза, итд. (максимум 20 подходов)
   - Подсчитать сколько он всего раз подтянется за N подходов, N задано с клавиатуры
   - Вывести сколько времени займет N подходов
     * каждое подтягивание занимает 5 секунд, перерыв 60 секунд.
     * каждый следующий перерыв между подходами увеличивается на 20%
     * вывести общее время в формате mm:ss (например 15:45) (пункт необязательный)

      P.S. При вводе с консоли количества подходов
      проверять его на целый тип и на диапазон (от 1 до 20 включительно)*/


public class lecture_4_Loops {
    public static void main(String[] args) {
        int choice = 0;                        //  количество подходов с клавиатуры
        int count = 0;                         //  счетчик подтягиваний
        int attempt = 0;                       //  счетчик попыток
        int timeLift = 5;                   //  время одного подтягивания
        int sumTimeLift = 0;                //  общее время подтягивания
        double timeOut = 60;                   //  время отдыха
        double sumTimeOut = 0;                 //  общее время отдыха
        boolean answer = true;                 //  управление while

        System.out.println("Введи количество подходов!!");

        while (answer) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Это должно быть целое число от 1 до 20!");

            if (sc.hasNextInt())
                choice = sc.nextInt();
            if (choice > 0 && choice <= 20) {
                answer = false;
            } else
                System.out.println("Введено не целое число или оно выходит за диапазон значений!Пробуй еще!");
            attempt++;
            if (attempt == 3) {
                System.out.println(" :-) Может хватит экспериментов :-) Все же работает!!! :-)");
            }
        }

        for (int i = 1; i <= choice; i++) {
            //sumTimeOut = timeOut;
            count += i;
            sumTimeLift = count * timeLift;
            if (choice <= 2) {
                sumTimeOut = timeOut * (choice - 1);
            } else {
                sumTimeOut = (timeOut * ((Math.pow(1.2, choice - 1)) - 1)) / 0.2;
            }
        }
        System.out.println("Количество подтягиваний = " + count);
        System.out.println("Время затраченное на подтягивания   = " + sumTimeLift + " секунд.");
        System.out.println("Общее время тренировки = " + (int) Math.ceil(sumTimeLift + sumTimeOut) + " секунд.");
        int sumTime = (int) Math.ceil(sumTimeLift + sumTimeOut);    // переменная для формата
        System.out.printf("Время в формате: " + "%02d:%02d", sumTime / 60, sumTime % 60);
    }
}

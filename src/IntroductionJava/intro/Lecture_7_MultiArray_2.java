package IntroductionJava.intro;


import java.util.Random;
import java.util.Scanner;

    /*
    В квадратной матрице поменять значения элементов в каждой строке,
    расположенные на главной и побочной диагоналях.
     */
// Работает на всех диапазонах значений sizeArr

public class Lecture_7_MultiArray_2 {
    public static void main(String[] args) {
        int sizeArr = 0; // размер массива с клавиатуры.
        System.out.println("""
                Привет!\s
                Сегодня создадим двумерный массив( квадратную матрицу )
                и заполним ее случайными числами от 1 до 50.""");
        System.out.println("Введи желаемый размер массива.");
        System.out.println("Это должно быть целое число не менее 2 !");
        Random random = new Random();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt())
                sizeArr = scanner.nextInt();
            if (sizeArr > 1) {
                break;
            } else System.out.println("Условие не соблюдено. Попробуй еще!");
        }
        System.out.println("Отлично! Ты выбрал размер " + sizeArr + "!");
        System.out.println("Наша матрица имеет такой вид!");
        int[][] array = new int[sizeArr][sizeArr];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1, 50);
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.println();
        }

        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i][i];
            array[i][i] = array[i][array.length - i - 1];
            array[i][array.length - i - 1] = temp;
        }

        System.out.println("После замены значений элементов матрица выглядит так.");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.println();
        }
    }
}





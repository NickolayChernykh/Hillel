package IntroductionJava.intro;


import java.util.Random;
import java.util.Scanner;

    /*
    В квадратной матрице поменять значения элементов в каждой строке,
    расположенные на главной и побочной диагоналях.
    Работает с диапазоном до 3.
     */

public class Lecture_7_MultiArray {
    public static void main(String[] args) {
        int sizeArr = 0; // размер массива с клавиатуры.
        System.out.println("""
                Привет!\s
                Сегодня создадим двумерный массив( квадратную матрицу )
                и заполним ее случайными числами от 1 до 40.""");
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
                array[i][j] = random.nextInt(1, 40);
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][array[j].length - 1 - j];
                array[i][array[j].length - 1 - j] = temp;
            }
        }
        System.out.println("После замены значений элементов матрица выглядит так.");
        for (int i = 0; i < sizeArr; i++) {
            for (int j = 0; j < sizeArr; j++) {
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.println();
        }
    }
}





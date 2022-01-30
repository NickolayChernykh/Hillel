package IntroductionJava.intro;

import java.util.Arrays;
import java.util.SplittableRandom;


/*
Отсортировать массив целых чисел сортировкой выбором.
*/
public class Lecture_10_ArraySorting {
    public static void main(String[] args) {
        SplittableRandom splittableRandom = new SplittableRandom();
        int [] array = splittableRandom.ints(10,-50,50).toArray();
        System.out.println("Массив до сортировки    " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Массив после сортировки " + Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimal = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minimal) {
                    minimal = array[j];
                    index = j;
                }
            }
            swap(array, i, index);
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

package IntroductionJava.oop;

import java.util.Arrays;

/**
 * Created by Chernykh on 08.02.2022
 */
public class Warehouse {
    private int [] arrayBox;
    private int quantityBox;
    private int sizeBoxArray;

    public int[] getArrayBox() {
        return arrayBox;
    }

    public Warehouse(int sizeBoxArray) {
        arrayBox = new int[sizeBoxArray];
        for (int i = 0; i < sizeBoxArray; i++) {
            arrayBox[i] = 0;
        }
    }
    private boolean indexOk(int index){
        if (index >= 0 &&  index < sizeBoxArray ) return true;
        return false;
    }

    public String toString(Warehouse warehouse) {
        return Arrays.toString(arrayBox);
    }
}



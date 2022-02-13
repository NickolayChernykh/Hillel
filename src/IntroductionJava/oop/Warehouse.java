package IntroductionJava.oop;


/**
 * Created by Chernykh on 08.02.2022
 */
public class Warehouse {
    public static int quantityBox;
    private Box[] arrayBox;
    private final int sizeBoxArray;

    public Warehouse(int sizeBoxArray) {
        arrayBox = new Box[this.sizeBoxArray = sizeBoxArray];
    }

    public void setBox(Box box, int whArrayIndex) {
        if (indexOk(whArrayIndex)) {
            arrayBox[whArrayIndex] = box;
        } else System.out.println("Невозможно добавить коробку на склад, выход за пределы размера склада!");
    }

    public void addBox(Box box) {
        int index;
        for (index = 0; index < sizeBoxArray; ) {
            if (indexOk(sizeBoxArray - 1) && arrayBox[index] == null) {
                arrayBox[index] = box;
                break;
            } else {
                index++;
            }
        }
        if (index == sizeBoxArray) {
            System.out.println("Склад полностью заполнен!!!");
        }
    }


    public boolean indexOk(int indexBox) {
        return indexBox >= 0 && indexBox < sizeBoxArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (Box str : arrayBox) {
            if (str != null) {
                quantityBox++;
                sb.append(str).append(" |||| ");
            }
        }
        return sb.delete(sb.length() - 1, sb.length()).append(" ]\nКоличество коробок на складе ").append(quantityBox).toString();
    }
}



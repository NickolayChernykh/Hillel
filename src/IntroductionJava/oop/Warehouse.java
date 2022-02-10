package IntroductionJava.oop;


/**
 * Created by Chernykh on 08.02.2022
 */
public class Warehouse {
    private  Box[] arrayBox;
    private final int sizeBoxArray;
    public static int quantityBox;


    public Warehouse(int sizeBoxArray) {
        arrayBox = new Box[this.sizeBoxArray = sizeBoxArray];
    }

    public void addBox(Box box, int whArrayIndex) {
        if (indexOk(whArrayIndex)) {
            arrayBox[whArrayIndex] = box;
        } else System.out.println("Невозможно добавить коробку на склад, выход за пределы размера склада.");
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
        return sb.delete(sb.length() - 1, sb.length()).append(" ]").toString();
    }
}



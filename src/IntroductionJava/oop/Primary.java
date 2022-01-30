package IntroductionJava.oop;


/*// ДЗ №12
    * Добавить в класс Box из предыдущей домашки несколько новых свойств (цвет и материал).
    * Реализовать новый конструктор (дополнительно к существующему),
      который будет устанавливать все поля, также добавить геттеры и сеттеры на каждое поле.
    * В сеттеры добавить логику на установку значений высоты, ширины и длинны - чтобы нельзя было
      установить значение меньше, либо равное нулю.
*/
public class Primary {
    public static void main(String[] args) {
        Box[] boxes = new Box[5];

        for (int i = 0, count = 1; i < boxes.length; i++, count++) {
            boxes[i] = new Box(count * 2, count * 2, count * 2);
            System.out.printf("Обьем коробки в обьекте №%d равен %d%n", count, boxes[i].volumeBox());
        }
        System.out.println();

        boxes[0].setLength(0);
        boxes[1].setWidth(-2);
        boxes[2].setHeight(-20);
        System.out.println();

        setNewBoxParams(1, 5, 5, 5, boxes);
    }

    private static void setNewBoxParams(int i, int length, int width, int height, Box[] boxes) {
        int box = i + 1;
        boxes[i].setLength(length);
        boxes[i].setWidth(width);
        boxes[i].setHeight(height);
        System.out.println("Новая длинна коробки обьекта №" + box + " = " + boxes[i].getLength());
        System.out.println("Новая ширина коробки обьекта №" + box + " = " + boxes[i].getWidth());
        System.out.println("Новая высота коробки обьекта №" + box + " = " + boxes[i].getHeight());
        System.out.println("Новый обьем коробки в обьекте №" + box + " = " + boxes[i].volumeBox());
    }

}

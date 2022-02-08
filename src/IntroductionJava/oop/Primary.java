package IntroductionJava.oop;


/*// ДЗ №13
    * Для класса Box из предыдущих домашек добавить дочерний класс ColorBox и вынести в него свойство color,
    * а из класса Box это свойство убрать.
    * Все методы для работы с этим свойством тоже перенести из класса Box в класс ColorBox.
    * Свойства color в классе ColorBox и material в Box переделать на Enum'ы
    * (создать перечисления для цветов и материалов и задать хотя бы по несколько возможных значений)
*/

public class Primary {
    public static void main(String[] args) {
        Box[] boxes = new Box[5];
        for (int i = 0, count = 1; i < boxes.length; i++, count++) {
            boxes[i] = new Box(count * 2, count * 2, count * 2);
            System.out.printf("Объем коробки в объекте №%d равен %d%n", count, boxes[i].volumeBox());
        }
        System.out.println();
        ColorBox[] colorBoxes = new ColorBox[4];
        int count = 1;
        for (int i = 0; i < colorBoxes.length; i++, count++) {
            Color color = null;
            Material material = null;
            colorBoxes[i] = new ColorBox(count * 3, count * 3, count * 3, material, color);
            switch (i) {
                case 0 -> {
                    material = Material.CARDBOARD;
                    Material.CARDBOARD.setMaterial("гофрокартон");
                    color = Color.INDETERMINATE;
                    Color.INDETERMINATE.setColor("еще не определен");
                }
                case 1 -> {
                    material = Material.PLASTIC;
                    color = Color.GREEN;
                }
                case 2 -> {
                    material = Material.WOOD;
                    color = Color.INDIGO;
                }
                case 3 -> {
                   material = Material.SHEET_IRON;
                   color = Color.VIOLET;
                }
            }

            System.out.printf("Объем коробки в объекте №%d равен %d, материал - %s, цвет - %s%n",
                    count, colorBoxes[i].volumeBox(), material, color);
        }

        System.out.println();

        boxes[0].setLength(0);
        boxes[1].setWidth(-2);
        System.out.println();
        colorBoxes[0].setLength(0);
        colorBoxes[3].setWidth(-1);

        System.out.println();
        System.out.println("Замена параметров default коробки:");
        setNewBoxParams(1, 5, 5, 5, boxes);
        System.out.println();
        System.out.println("Замена параметров цветной коробки:");
        setNewBoxParams(3, 10,10,10 , colorBoxes);
    }

    private static void setNewBoxParams(int i, int length, int width, int height, Box[] boxes) {
        int box = i + 1;
        boxes[i].setLength(length);
        boxes[i].setWidth(width);
        boxes[i].setHeight(height);
        System.out.println("Новая длинна коробки объекта №" + box + " = " + boxes[i].getLength());
        System.out.println("Новая ширина коробки объекта №" + box + " = " + boxes[i].getWidth());
        System.out.println("Новая высота коробки объекта №" + box + " = " + boxes[i].getHeight());
        System.out.println("Новый объем коробки в объекта №" + box + " = " + boxes[i].volumeBox());
    }

}

package IntroductionJava.oop;


/*// ДЗ №13
    * Для класса Box из предыдущих домашек добавить дочерний класс ColorBox и вынести в него свойство color,
    * а из класса Box это свойство убрать.
    * Все методы для работы с этим свойством тоже перенести из класса Box в класс ColorBox.
    * Свойства color в классе ColorBox и material в Box переделать на Enum'ы
    * (создать перечисления для цветов и материалов и задать хотя бы по несколько возможных значений)
*/

public class Primary {
    static Color color;
    static Material material;
    public static void main(String[] args) {
        Box[] boxes = new Box[5];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box((i+1) * 2, (i+1) * 2, (i+1) * 2);
            System.out.printf("Объем коробки в объекте №%d равен %d%n", i, boxes[i].volumeBox());
        }
        System.out.println();
        ColorBox[] colorBoxes = new ColorBox[4];
        for (int i = 0; i < colorBoxes.length; i++) {
            colorBoxes[i] = new ColorBox((i+1) * 3, (i+1) * 3, (i+1) * 3, material, color);
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

            System.out.printf("Объем коробки в ячейке №%d равен %d, материал - %s, цвет - %s%n",
                    i, colorBoxes[i].volumeBox(), material, color);

        }
        System.out.println();
        System.out.println(boxes[0]);
        System.out.println();
        System.out.println(colorBoxes[0]);
        System.out.println(colorBoxes[1]);
        System.out.println(colorBoxes[2]);
        System.out.println(colorBoxes[3]);

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

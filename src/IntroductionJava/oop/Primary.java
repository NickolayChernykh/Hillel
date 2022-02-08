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
        for (int i = 0; i < boxes.length; i++) {
            if (i == 0) {
                boxes[i] = new Box(1, 2, 3);
                System.out.printf("Объем коробки в объекте №%d равен %d%n", i, boxes[i].volumeBox());
            } else boxes[i] = new Box(i * 2, i * 2, i * 2);
            System.out.printf("Объем коробки в объекте №%d равен %d%n", i, boxes[i].volumeBox());

        }
        System.out.println();
        Box[] colorBoxes = new ColorBox[4];
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

    }
}

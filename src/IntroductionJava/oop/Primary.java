package IntroductionJava.oop;


/*// ДЗ №13
 * Для класса Box из предыдущих домашек добавить дочерний класс ColorBox и вынести в него свойство color,
 * а из класса Box это свойство убрать.
 * Все методы для работы с этим свойством тоже перенести из класса Box в класс ColorBox.
 * Свойства color в классе ColorBox и material в Box переделать на Enum'ы
 * (создать перечисления для цветов и материалов и задать хотя бы по несколько возможных значений)
 */

public class Primary {
    static String boxMsg = "Объем коробки в объекте №%d равен %d. Параметры - %s%n";
    static String boxMsg1 = "Объем коробки в объекте №%d равен %d. Параметры - %s%n";
    static Color color;
    static Material material;

    public static void main(String[] args) {
        Box[] boxes = new Box[4];
        for (int i = 0; i < boxes.length; i++) {
            switch (i) {
                case 0 -> material = Material.CARDBOARD;
                case 1 -> material = Material.PLASTIC;
                case 2 -> material = Material.WOOD;
                case 3 -> material = Material.SHEET_IRON;
            }
            boxes[i] = new Box((i + (-1)), (i + 1), (i + 1), material);
            System.out.printf(boxMsg, i, boxes[i].volumeBox(), boxes[i]);
        }
        System.out.println();
        Box[] colorBoxes = new ColorBox[4];
        for (int i = 0; i < colorBoxes.length; i++) {
            switch (i) {
                case 0 -> {
                    material = Material.CARDBOARD;
                    color = Color.RED;
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
            colorBoxes[i] = new ColorBox((i + 1) * 3, (i + 1) * 3, (i + 1) * 3, material, color);
            System.out.printf(boxMsg1, i, colorBoxes[i].volumeBox(), colorBoxes[i]);
        }
    }
}

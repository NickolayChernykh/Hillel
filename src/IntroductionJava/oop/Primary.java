package IntroductionJava.oop;


/*// ДЗ №14
 * Для классов Box и ColorBox из предыдущей домашки переопределить метод toString класса Object,
 * в котором в реализации класса Box возвращать информацию о длине, ширине и высоте, а также материала коробки,
 * а для класса ColorBox - всю ту же информации плюс информацию о цвете коробки.
 * Добавить в конструктор класса Box генерацию исключения если хоть одна из сторон была задана
 * неверно (меньше либо равна нулю) и обрабатывать это исключение в месте создания экземпляра
 * коробки (как Box так и ColorBox).
 * Также создать класс Склад (Warehouse, например), который будет в себе содержать массив коробок
 * (именно базовый тип коробок - Box) и количество коробок, которые уже добавлены в этот массив.
 * Массив создавать в конструкторе этого класса (размер массива принимать как параметр конструктора).
 * Реализовать метод в этом классе для добавления коробки в массив (тип брать опять же базовый - Box),
 * предусмотреть валидацию - проверять, можно ли ещё добавить в массив коробку,
 * количество добавленных коробок не должно превышать длину массива.
 * Также переопределить метод toString для этого класса - который будет возвращать
 * информацию о всех коробках, которые хранит в себе склад.
 * В методе main создать экземпляр класса Склад (задать его вместимость с помощью конструктора).
 * Заполнить склад коробками (разными - как экземплярами Box, так и ColorBox) и
 * вывести информацию о складе (вызвать метод склада toString).
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
            try {
                boxes[i] = new Box((i + 1), (i + 1), (i + 1), material);
                System.out.printf(boxMsg, i, boxes[i].volumeBox(), boxes[i]);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Один из параметров коробки № " + i + " меньше или равен \"0\"!");
            }
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
            try {
                colorBoxes[i] = new ColorBox((i) * 3, (i + 1) * 3, (i + 1) * 3, material, color);
                System.out.printf(boxMsg1, i, colorBoxes[i].volumeBox(), colorBoxes[i]);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Один из параметров коробки № " + i + " меньше или равен \"0\"!");
            }
        }
        Warehouse warehouse = new Warehouse(5);
        System.out.println();

        // Попытка выйти за размер склада или добавить коробку с отсутствующим размером
        warehouse.setBox(boxes[3], -1);
        warehouse.setBox(colorBoxes[2], 5);
        warehouse.addBox(colorBoxes[0]);

        // Добавление на склад(addBox - в первую свободную ячейку, setBox - принудительно в указанную ячейку)
        warehouse.addBox(colorBoxes[1]);
        warehouse.addBox(boxes[0]);
        warehouse.setBox(colorBoxes[2], 2);
        warehouse.setBox(boxes[3], 4);
        warehouse.addBox(boxes[2]);

        // Попытка добавить больше коробок
        warehouse.addBox(boxes[2]);

        System.out.println();
        System.out.println(warehouse);

    }
}

package IntroductionJava;

/*
    *  Создать класс Box с полями ширина, высота, длина.
    *  Определить метод класса, который вычисляет объем этой коробки (ширина * высоту * длину).
    *  Создать 5 конкретных объектов этого класса и задать с помощью конструктора конкретное состояние этих
      объектов (конкретные величины ширины, высоты и длины). Вывести на экран объемы этих коробок
*/
// ДЗ №12
public class Primary {
    public static void main(String[] args) {
        Box[] boxes = new Box[5];
        for (int i = 0, count = 1; i < boxes.length; i++, count++) {
            boxes[i] = new Box(count * 2, count * 2, count * 2);
            System.out.printf("Обьем коробки в обьекте №%d равен %d%n", count, boxes[i].volumeBox());
        }
    }
}

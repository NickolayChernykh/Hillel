package IntroductionJava.oop;


public class Box {
    private int length;
    private int width;
    private int height;
    private Material material;

    public int volumeBox() {
        return length * width * height;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int length, int width, int height, Material material) {
        this(length, width, height);
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else System.out.println("Длина должна быть положительным числом!!");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else System.out.println("Ширина должна быть положительным числом!!");

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else System.out.println("Высота должна быть положительным числом!!");
    }
    public static void setNewBoxParams(int i, int length, int width, int height, Box[] boxes) {
        int box = i + 1;
        boxes[i].setLength(length);
        boxes[i].setWidth(width);
        boxes[i].setHeight(height);
        System.out.println("Новая длинна коробки объекта №" + box + " = " + boxes[i].getLength());
        System.out.println("Новая ширина коробки объекта №" + box + " = " + boxes[i].getWidth());
        System.out.println("Новая высота коробки объекта №" + box + " = " + boxes[i].getHeight());
        System.out.println("Новый объем коробки в объекта №" + box + " = " + boxes[i].volumeBox());
    }

    @Override
    public String toString() {
        return  "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", material=" + material +
                '}';
    }
}



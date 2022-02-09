package IntroductionJava.oop;


public class Box {
    private int length;
    private int width;
    private int height;
    private Material material;

    public int volumeBox() {
        int volume = length * width * height;
        return volume;
    }

    public Box(int length, int width, int height, Material material) {
        boolean isValid = false;
        if (length <= 0 || height <= 0 || width <= 0) {
            isValid = true;
        }
        try {
            if (isValid) throw new IllegalArgumentException();
            this.length = length;

        } catch (IllegalArgumentException ie) {
            System.out.println("Таких коробок не бывает");
            return;
        }
        this.width = width;
        this.height = height;
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "длина = " + length +
                ", ширина = " + width +
                ", высота = " + height +
                ", изготовлена из = " + material;
    }
}



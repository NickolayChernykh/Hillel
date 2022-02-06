package IntroductionJava.oop;


public class Box {
    private int length;
    private int width;
    private int height;

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
}



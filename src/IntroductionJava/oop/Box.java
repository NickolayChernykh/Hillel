package IntroductionJava.oop;


public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private String material;

    public int volumeBox() {
        return length * width * height;
    }


    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int length, int width, int height, String color, String material) {
        this(length, width, height);
        this.color = color;
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
        else System.out.println("Длина должна быть положительным числом!!");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0 ){
            this.width = width;
        }
        else System.out.println("Ширина должна быть положительным числом!!");

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
        else System.out.println("Высота должна быть положительным числом!!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}



package IntroductionJava.oop;

/**
 * Created by Chernykh on 06.02.2022
 */
public class ColorBox extends Box{
    private Color color;

    public ColorBox(int length, int width, int height, Material material, Color color) {
        super(length, width, height, material);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", цвет " + color;
    }
}

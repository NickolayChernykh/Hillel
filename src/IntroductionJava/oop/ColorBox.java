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

    @Override
    public int volumeBox() {
        return super.volumeBox();
    }


    @Override
    public String toString() {
        return "Color" + super.toString() + " цвет " + color;
    }
}

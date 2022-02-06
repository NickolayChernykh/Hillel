package IntroductionJava.oop;

/**
 * Created by Chernykh on 06.02.2022
 */
public class ColorBox extends Box{

    public ColorBox(int length, int width, int height, Material material, Color color) {
        super(length, width, height, material);
    }

    @Override
    public int volumeBox() {
        return super.volumeBox();
    }

}

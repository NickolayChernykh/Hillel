package IntroductionJava;


public class Box {
    int length;
    int width;
    int height;

    public int volumeBox() {
        return length * width * height;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}



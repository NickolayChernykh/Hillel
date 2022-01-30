package IntroductionJava.intro;

/**
 * Created by Chernykh on 19.01.2022
 */
public class Lecture_9_Recursion {
    public static void main(String[] args) {
        System.out.println("Число 2 в степени 5 = " + exponentiation(2, 5));

    }

    public static int exponentiation(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }
        return base * exponentiation(base, (exponent - 1));
    }
}


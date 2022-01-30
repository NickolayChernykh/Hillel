package IntroductionJava.intro;

import java.util.Locale;
import java.util.Scanner;

public class lecture_2_MassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Напиши свой вес и рост!");
        double bmi = sc.nextInt() / Math.pow(sc.nextDouble(),2);
        System.out.printf("Индес массы твоего тела равен: %.2f",bmi);
    }
}

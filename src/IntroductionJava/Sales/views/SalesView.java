package IntroductionJava.Sales.views;


import IntroductionJava.Sales.models.Product;

import java.util.Scanner;

import static IntroductionJava.Sales.utils.Validator.*;


// View
public class SalesView {


    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;



    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product model) {

    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.println(title);
        validateName(scanner);
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.


        title = "Введите количество: ";
        System.out.println(title);
        validateQuantityInput(scanner);
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.

        title = "Введите цену: ";
        validatePriceInput(scanner);
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

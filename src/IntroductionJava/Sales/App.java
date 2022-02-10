package IntroductionJava.Sales;

import IntroductionJava.Sales.controllers.ProductController;
import IntroductionJava.Sales.models.Product;
import IntroductionJava.Sales.views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller ,
        // на основании соответствующих конструкторов.
//        Product model = создать экземпляр
        Product model = new Product();
//        SalesView view = создать экземпляр
        SalesView view = new SalesView(model);
//        ProductController controller = создать экземпляр
        ProductController controller = new ProductController(model, view);
        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после правильной настройки приложения
        controller.runApp();
    }
}

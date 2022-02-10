package IntroductionJava.Sales.controllers;


import IntroductionJava.Sales.models.Product;
import IntroductionJava.Sales.views.SalesView;


// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = "[здесь должен быть вывод по формату]" + "\"Наименование товара: Апельсины\n" +
                "        Общий доход (грн.): 95,88\n" +
                "        Сумма налога (грн.): 4,79\n" +
                "        Чистый доход (грн.): 91,09;";

        view.getOutput(output);
    }
}

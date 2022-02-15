package IntroductionJava.Sales.models;


import IntroductionJava.Sales.base.Fiscal;
import IntroductionJava.Sales.base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Fiscal, Income {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    // Налоговою ставку объявите в виде константы
    // здесь ...
    public final int TAX_RATE = 5;

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTAX_RATE() {
        return TAX_RATE;
    }




    // Переопределите методы реализуемых интерфейсов.

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь  ...

    @Override
    public double profit(int quantity, double price) {
        double p = quantity * price;
        return p;
    }



    // Расчёт суммы налога с продаж.
    // здесь ...
    @Override
    public  double tax(double profit, int tRate) {
        double t = profit * tRate;
        return t;
    }




    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    @Override
    public double profit(double profits, double tax) {
        double netProf = profits - tax;
        return netProf;
    }
}

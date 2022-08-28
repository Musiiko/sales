package Sales.src.views;

import Sales.src.models.Product;
import Sales.src.utils.Validator;

import java.util.Scanner;

public class SalesView {
    String title;
    String name;
    int quantity;
    double price;
    Product model;
    Scanner scanner;

    public SalesView(Product model) {

        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество: ";
        System.out.print(title);
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "Введите цену: ";
        System.out.print(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {

        System.out.println(output);
    }

}

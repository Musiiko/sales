package Sales.src;

import Sales.src.controllers.ProductController;
import Sales.src.models.Product;
import Sales.src.views.SalesView;

public class App {
    public static void main(String[] args) {
        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);

        controller.runApp();
    }

}




package SupermarketSystem.domain;


import java.util.List;

public interface ShoppingCart {

    double calculateSalesPrice();
    double calculatePurchasePrice();
    double calculateProfit();
    List<ProductInterface> getProducts();

}

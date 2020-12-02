package SupermarketSystem.domain;

import SupermarketSystem.domain.ProductInterface;

import java.util.List;

public interface ShoppingCart {

    double calculateSalesPrice();
    double calculatePurchasePrice();
    double calculateProfit();
    List<ProductInterface> getProducts();

}

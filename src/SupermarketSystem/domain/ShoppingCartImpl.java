package SupermarketSystem.domain;

import java.util.List;

public class ShoppingCartImpl implements ShoppingCart{

    // Liste vom Typ SupermarketSystem.domain.ProductInterface
    private final List<ProductInterface> products;

    public ShoppingCartImpl(List<ProductInterface> products) {
        this.products = products;
    }

    public List<ProductInterface> getProducts() {
        return products;
    }

    public double calculateSalesPrice () {


        double totalSalesPrice = 0;

        for (ProductInterface product : products) {
            totalSalesPrice = totalSalesPrice + product.getSalesPrice();
        }
        return totalSalesPrice;
    };

    public double calculatePurchasePrice () {
        double totalPurchasePrice = 0;

        for (ProductInterface product : products) {
            totalPurchasePrice = totalPurchasePrice + product.getPurchasePrice();
        }
        return totalPurchasePrice;
    };


    public double calculateProfit() {
        double totalProfit = 0;

        for (ProductInterface product : products) {
            totalProfit = totalProfit + (product.getSalesPrice() - product.getPurchasePrice());
        }
        return totalProfit;
    };




}

package SupermarketSystem.domain;

import java.util.List;

public class ShoppingCartImpl implements ShoppingCart{

    // Liste vom Typ SupermarketSystem.domain.IProduct
    private final List<IProduct> products;

    public ShoppingCartImpl(List<IProduct> products) {
        this.products = products;
    }

    public List<IProduct> getProducts() {
        return products;
    }

    public double calculateSalesPrice () {


        double totalSalesPrice = 0;

        for (IProduct product : products) {
            totalSalesPrice = totalSalesPrice + product.getSalesPrice();
        }
        return totalSalesPrice;
    }

    public double calculatePurchasePrice () {
        double totalPurchasePrice = 0;

        for (IProduct product : products) {
            totalPurchasePrice = totalPurchasePrice + product.getPurchasePrice();
        }
        return totalPurchasePrice;
    }


    public double calculateProfit() {
        double totalProfit = 0;

        for (IProduct product : products) {
            totalProfit = totalProfit + (product.getSalesPrice() - product.getPurchasePrice());
        }
        return totalProfit;
    }




}

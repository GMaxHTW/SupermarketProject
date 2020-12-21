package SupermarketSystem.domain;

import java.util.ArrayList;

public class DrugstoreArticle extends AbstractProduct{


    public DrugstoreArticle(String name, double salesPrice, double purchasePrice, String ingredients) {
        super(name, salesPrice, purchasePrice, ingredients);
    }

    @Override
    public String toString() {
        return "Name des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }
}

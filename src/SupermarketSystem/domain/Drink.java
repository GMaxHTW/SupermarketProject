package SupermarketSystem.domain;

import java.util.ArrayList;

public class Drink extends AbstractProduct{

    DrinkValue drinkValue;
    public Drink(String name, double salesPrice, double purchasePrice, String ingredients, DrinkValue drinkValue) {
        super(name, salesPrice, purchasePrice, ingredients);
        this.drinkValue = drinkValue;
    }

    @Override
    public String toString() {
        return "\nName des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }
}

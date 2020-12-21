package SupermarketSystem.domain;

import java.util.ArrayList;

public class Food extends AbstractProduct{

    FoodValue foodValue;


    public Food(String name, double salesPrice, double purchasePrice, String ingredients, FoodValue foodValue) {
        super(name, salesPrice, purchasePrice, ingredients);
        this.foodValue = foodValue;
    }

    @Override
    public String toString() {
        return "Name des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }

}

package SupermarketSystem.domain;

public class Food extends AbstractProduct{

    FoodValue foodValue;


    public Food(String name, double salesPrice, double purchasePrice, FoodValue foodValue) {
        super(name, salesPrice, purchasePrice);
        this.foodValue = foodValue;
    }

    @Override
    public String toString() {
        return "Name des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }

}

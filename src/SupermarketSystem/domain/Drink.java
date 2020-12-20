package SupermarketSystem.domain;

public class Drink extends AbstractProduct{

    DrinkValue drinkValue;
    public Drink(String name, double salesPrice, double purchasePrice, DrinkValue drinkValue) {
        super(name, salesPrice, purchasePrice);
        this.drinkValue = drinkValue;
    }

    @Override
    public String toString() {
        return "\nName des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }
}

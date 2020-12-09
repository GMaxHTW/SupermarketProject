package SupermarketSystem.domain;

public class Food extends AbstractProduct{




    // Konstruktor SupermarketSystem.domain.Food
    public Food(String name, double salesPrice, double purchasePrice) {
        super(name, salesPrice, purchasePrice);
    }

    @Override
    public String toString() {
        return "Name des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }


//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof AbstractProduct) {
//
//        }
//        return 0;
//    }
}

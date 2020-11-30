public class Food extends AbstractProduct{




    // Konstruktor Food
    public Food(String name, double salesPrice, double purchasePrice) {
        super(name, salesPrice, purchasePrice);
    }

    @Override
    public String toString() {
        return "Name des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }

}

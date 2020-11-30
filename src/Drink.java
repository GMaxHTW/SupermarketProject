public class Drink extends AbstractProduct{



    // Konstruktor Drinnks
    public Drink(String name, double salesPrice, double purchasePrice) {
        super(name, salesPrice, purchasePrice);
    }


    // toString Methode


    @Override
    public String toString() {
        return "\nName des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }
}

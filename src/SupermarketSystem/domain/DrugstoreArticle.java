package SupermarketSystem.domain;

public class DrugstoreArticle extends AbstractProduct{


    public DrugstoreArticle(String name, double salesPrice, double purchasePrice) {
        super(name, salesPrice, purchasePrice);
    }

    @Override
    public String toString() {
        return "Name des Produktes: " + getName() + "\nVerkaufspreis: " + getSalesPrice()
                + "\nEinkaufspreis: " + getPurchasePrice();
    }
}

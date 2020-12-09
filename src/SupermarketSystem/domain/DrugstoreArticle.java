package SupermarketSystem.domain;

public class DrugstoreArticle extends AbstractProduct{


    // Konstruktor DrugstoreArticles
    public DrugstoreArticle(String name, double salesPrice, double purchasePrice) {
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

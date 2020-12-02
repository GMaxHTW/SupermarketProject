import java.util.HashMap;
import java.util.Map;

public class ArticleData {




    // Map Produktdaten Essen
    public static Map <String, Double> foods = Map.of(
            "DieBackfrische", 2.79,
            "Studentenfutter", 1.50);

    // Map Produktdaten Drinks
    public static Map <String, Double> drinks = Map.of(
            "Summer Ale", 2.50,
            "Sterni", 0.4);


    // Map Produktdaten DrugstoreArticles
    public static Map <String, Double> drugStoreArticles = Map.of(
            "Toilettenpapier (ultra soft)", 2.89,
            "Studentenfutter", 1.50);


    // Gibt HasMap mit allen Artikeln zurück
// Führt also die Maps foods, drinks, drugStoreArticles in eine Map
    public static Map <String, Double> getAllArticles() {
        Map <String, Double> articles = new HashMap<>();
        articles.putAll(foods);
        articles.putAll(drinks);
        articles.putAll(drugStoreArticles);
        return articles;
    }

    public static String printAllArticles() {
        return getAllArticles().toString();
    }



}



// unnötig ????
//    // Attribute Article Data
//    private final String name;
//    private final double salesPrice;
//    private final double purchasePrice;
//
//    // Konstruktor Article Data
//    public ArticleData (String name, double salesPrice, double purchasePrice) {
//        this.name = name;
//        this.salesPrice = salesPrice;
//        this.purchasePrice = purchasePrice;
//    }


// Getter für die Attribute von Article Daata
//    public String getName() {
//        return name;
//    }
//
//    public double getSalesPrice() {
//        return salesPrice;
//    }
//
//    public double getPurchasePrice() {
//        return purchasePrice;
//    }



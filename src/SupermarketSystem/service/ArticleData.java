package SupermarketSystem.service;

import java.util.HashMap;
import java.util.Map;

public class ArticleData {

    private final String name;
    private final double salesPrice;
    private final double purchasePrice;

    public ArticleData (String name, double salesPrice, double purchasePrice) {
        this.name = name;
        this.salesPrice = salesPrice;
        this.purchasePrice = purchasePrice;
    }




    // Map Produktdaten Essen
    public static Map <Integer, ArticleData> foods = Map.of(
            100, new ArticleData("Die Backfrische", 2.79, 1.2),
            101, new ArticleData("Studentenfutter", 1.5, 0.5));

    // Map Produktdaten Drinks
    public static Map <Integer, ArticleData> drinks = Map.of(
            200, new ArticleData("Summer Ale", 2.5, 1.3),
            201, new ArticleData("Sterni", 0.4, 0.22));



    // Map Produktdaten DrugstoreArticles
    public static Map <Integer, ArticleData> drugStoreArticles = Map.of(
            300, new ArticleData("Toilettenpapier (ultra soft", 2.89, 1.3),
            301, new ArticleData("Nivea Stress Protect", 1.5, 0.6));



    // Gibt HasMap mit allen Artikeln zurück
// Führt also die Maps foods, drinks, drugStoreArticles in eine Map
    public static Map <Integer, ArticleData> getAllArticles() {
        Map <Integer, ArticleData> articles = new HashMap<>();
        articles.putAll(foods);
        articles.putAll(drinks);
        articles.putAll(drugStoreArticles);
        return articles;
    }

    public static String printAllArticles() {
        return getAllArticles().toString();
    }


    public String getName() {
        return name;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }


}



// unnötig ????
//    // Attribute Article Data
//    private final String name;
//    private final double salesPrice;
//    private final double purchasePrice;
//
//    // Konstruktor Article Data
//    public SupermarketSystem.service.ArticleData (String name, double salesPrice, double purchasePrice) {
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



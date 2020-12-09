package SupermarketSystem.service;



import java.util.*;
import java.util.stream.Collectors;

public class ArticleData implements IArticleData{

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
            101, new ArticleData("Studentenfutter", 1.5, 0.5),
            102, new ArticleData("Paprika Chips", 1.8, 0.7),
            103, new ArticleData("Morzarella", 1.2, 0.4));

    // Map Produktdaten Drinks
    public static Map <Integer, ArticleData> drinks = Map.of(
            200, new ArticleData("Summer Ale", 2.5, 1.3),
            201, new ArticleData("Sterni", 0.4, 0.22),
            202, new ArticleData("Paulaner Spezi", 0.9, 0.35),
            203, new ArticleData("Lemonaid", 1.8, 0.9),
            204, new ArticleData("Orangen Saft", 1.3, 0.4),
            205, new ArticleData("Apfelsaft", 1.2, 0.5),
            206, new ArticleData("Kirschsaft", 1.9, 0.8));


    // Map Produktdaten DrugstoreArticles
    public static Map <Integer, ArticleData> drugStoreArticles = Map.of(
            300, new ArticleData("Toilettenpapier (ultra soft", 2.89, 1.3),
            301, new ArticleData("Nivea Stress Protect", 1.5, 0.6),
            302, new ArticleData("Seife 1", 1.5, 0.6),
            303, new ArticleData("Seife 2", 1.5, 0.6),
            304, new ArticleData("Seife 3", 1.1, 0.3));


    // Gibt HasMap mit allen Artikeln zurück
    // Führt also die Maps foods, drinks, drugStoreArticles in eine Map
    public static Map <Integer, ArticleData> getAllArticles() {
        Map <Integer, ArticleData> articles = new HashMap<>();
        articles.putAll(foods);
        articles.putAll(drinks);
        articles.putAll(drugStoreArticles);
        return articles;
    }

    public static LinkedHashSet<String> getArticleNames () {
        Set<ArticleData> articlesData = (Set<ArticleData>) ArticleData.getAllArticles().values();

        LinkedHashSet <String> articleNames = new LinkedHashSet<>();
        articlesData.forEach(article -> articleNames.add(article.getName()));

        return articleNames;
    }



    public static LinkedHashSet<Integer> getArticleIds () {
        Set<ArticleData> articlesData = (Set<ArticleData>) ArticleData.getAllArticles().values();

        LinkedHashSet <Integer> articleIds = new LinkedHashSet<>();
        articlesData.forEach(article -> articleIds.add(article.hashCode()));

        return articleIds;
    }



    // tbd: wie bekomme ich die IDS und die Namen in eine Map ???
    // Probleme Set in LinkedHashMap zu
    public static Map <Integer, String> getArticleIdsNames() {

        // Leere ERgebnis Liste
        Map <Integer, String> articleIdsNames = new LinkedHashMap<>();

        // Algo füllt Liste
        getAllArticles().entrySet().forEach(x -> articleIdsNames.put(x.getKey(), x.getValue().getName()));


        // Hier alles in einer Zeile
        // Rückgabewert der Collect Methode liefert Ergebnis direkt
        Map <Integer, String> resultMap = getAllArticles().entrySet().stream().collect(Collectors.toMap(
                x -> x.getKey(),
                x -> x.getValue().getName()));  //mit enty Set anderes Interface --> Dargestellt als Liste von EInträgen

        //articleIdsNames.entrySet(articleIds, articleNames);



        return articleIdsNames;
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


    // Macht doch auch net wirkllich Sinn weil das dann das selbe ist wie getName
    @Override
    public String toString() {
        return name;
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



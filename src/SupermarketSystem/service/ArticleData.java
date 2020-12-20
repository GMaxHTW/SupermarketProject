package SupermarketSystem.service;



import SupermarketSystem.domain.*;

import java.util.*;
import java.util.stream.Collectors;

public class ArticleData {

    private static ArticleData data;

    private ArticleData(){
    }

    public static ArticleData getInstance() {
        if (data == null) {
            data = new ArticleData();
        }
        return data;
    }

    // Map Produktdaten Essen
    public static Map <Integer, IProduct> foods = Map.of(
            100, new Food("Die Backfrische", 2.79, 1.2,
                    new FoodValue(3,3,3, 3,3, 3, 4,4,4)),
            101, new Food("Studentenfutter", 1.5, 0.5,
                    new FoodValue(3,3,3, 3,3, 3, 4,4,4)),

            102, new Food("Paprika Chips", 1.8, 0.7,
                                  new FoodValue(3,3,3, 3,3, 3, 4,4,4)));

    // Map Produktdaten Drinks
    public static Map <Integer, IProduct> drinks = Map.of(
            200, new Drink("Summer Ale", 2.5, 1.3,
                    new DrinkValue(500,3,3,3,3)),
            201, new Drink("Sterni", 0.4, 0.22,
                    new DrinkValue(500,3,3,3,3)),

            202, new Drink("Paulaner Spezi", 0.9, 0.35,
                    new DrinkValue(500,3,3,3,3)),

            203, new Drink("Lemonaid", 1.8, 0.9,
                    new DrinkValue(500,3,3,3,3)),

            204, new Drink("Orangen Saft", 1.3, 0.4,
                    new DrinkValue(500,3,3,3,3)),

            205, new Drink("Apfelsaft", 1.2, 0.5,
                    new DrinkValue(500,3,3,3,3)),

            206, new Drink("Kirschsaft", 1.9, 0.8,
                    new DrinkValue(500,3,3,3,3)));


    // Map Produktdaten DrugstoreArticles
    public static Map <Integer, IProduct> drugStoreArticles = Map.of(
            300, new DrugstoreArticle("Toilettenpapier (ultra soft", 2.89, 1.3),
            301, new DrugstoreArticle("Nivea Stress Protect", 1.5, 0.6),
            302, new DrugstoreArticle("Seife 1", 1.5, 0.6),
            303, new DrugstoreArticle("Seife 2", 1.5, 0.6),
            304, new DrugstoreArticle("Seife 3", 1.1, 0.3));



    // Gibt HasMap mit allen Artikeln zurück
    // Führt also die Maps foods, drinks, drugStoreArticles in eine Map
    public Map <Integer, IProduct> getAllArticles() {
        Map <Integer, IProduct> articles = new HashMap<>();
        articles.putAll(foods);
        articles.putAll(drinks);
        articles.putAll(drugStoreArticles);
        return articles;
    }

    public Map <String, Integer> mapNameIds() {
        Map <String, Integer> resultMap = getAllArticles().entrySet().stream().collect(Collectors.toMap(
                x -> x.getValue().getName(),
                x -> x.getKey()
        ));
        return resultMap;
    }




    public static String printAllArticles () {
        return String.join("", data.getAllArticles().toString());
    }





}






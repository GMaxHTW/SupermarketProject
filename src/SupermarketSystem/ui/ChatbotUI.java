package SupermarketSystem.ui;

import java.util.*;

import SupermarketSystem.domain.ShoppingCart;
import SupermarketSystem.service.ShoppingCartBuilder;
import SupermarketSystem.service.ArticleData;


public class ChatbotUI {
    private final UserInputWrapper input;
    private final ShoppingCartBuilder builder;
    private final InputParser parser;

    public ChatbotUI(UserInputWrapper uiw, ShoppingCartBuilder bb, InputParser ip) {
        input = uiw;
        builder = bb;
        parser = ip;
    }

    public String launch() {
        String inputLine = input.ask("Willkommen im Supermarkt! Was würdest du gerne einkaufen?");
        while (!(inputLine.equals("Bestellung abschliessen") || inputLine.equals("Auf Wiedersehen"))) {
            List<Integer> articles = articleIdsFromOrder(inputLine);
            if(articles.isEmpty()) {
                inputLine = input.ask("Entschuldigung, ich habe dich nicht verstanden. Waehle aus den folgenden Produkten: "
                        + ArticleData.printAllArticles());
            } else {
                builder.addArticlesById(articles);
               ShoppingCart shoppingCart = builder.build();
                inputLine = input.ask("In Ordnung. In deinem Einkaufswagen sind folgende Produkte: " + shoppingCart.getProducts() +
                        " kostet " + shoppingCart.calculateSalesPrice() + " Euro. Willst du die Bestellung abschliessen?");
            }
        }
        return inputLine;
    }

    // nur public zum einfacheren Testen
    public List<Integer> articleIdsFromOrder(String inputLine) {

        // Was ist denn genau der Unterschied zwischen einem Set und einer Liste ???
        Set<ArticleData> articlesData = (Set<ArticleData>) ArticleData.getAllArticles().values();//get(new ArticleData("Nivea Stress Protect", 1.5, 0.6)));  // Liefert Set mit allen Produktnamen


        /**
         * Hier die ganzen Sets
         *
         * Macht das nicht Sinn die wo anders zu implementieren und dann nur aufzurufen?
         *
         */
        Set <String> articleNames = new LinkedHashSet<>();
        articlesData.forEach(article -> articleNames.add(article.getName()));   // Diese Funktion nochmal genauer anschauen

        Set <Double> articleSalesPrices = new LinkedHashSet<>();
        articlesData.forEach(article -> articleSalesPrices.add(article.getSalesPrice()));

        Set <Double> articlePurchasePrices = new LinkedHashSet<>();
        articlesData.forEach(article -> articlePurchasePrices.add(article.getPurchasePrice()));

        Set <Integer> articleIds = new LinkedHashSet<>();
        Set<Integer> integers = ArticleData.getAllArticles().keySet();
        articlesData.forEach(article -> articleIds.add(article.hashCode()));

        // tbd: Hier muss ich i-wie ein String Set bekommen um die Keywords auslesen zu können

        Map <String, Integer> articleCount = parser.countKeywords(inputLine, articleNames); // Gibt Liste mit Artikeln die keywords entsprechen

        Map<Integer, ArticleData> articleMap = ArticleData.getAllArticles();

        List<Integer> ids = new ArrayList<>();


        for (Map.Entry<String, Integer> entry : articleCount.entrySet()) {
            String articleName = entry.getKey();
            ArticleData articleId = articleMap.get(articleName);
            int count = entry.getValue();


            for (int frequency = 0; frequency < count; frequency++) {
                ids.add(articlesData.hashCode());

                //ids.add(articleIds);
            }
        }

        Collections.sort(ids);

        return ids;
    }
}



//        Set<String> articles = Menu.getAllArticles().keySet();
//        Map<String, Integer> articleCount = parser.countKeywords(inputLine, articles);
//        Map<String, Integer> articleMap = Menu.getAllArticles();
//        List<Integer> ids = new ArrayList<>();
//
//        for (Map.Entry<String, Integer> entry : articleCount.entrySet()) {
//            String articleName = entry.getKey();
//            int articleId = articleMap.get(articleName);
//            int count = entry.getValue();
//
//            for (int frequency = 0; frequency < count; frequency++) {
//                ids.add(articleId);
//            }
//        }
//
//        Collections.sort(ids);


//    public String launch() {
//        String inputLine = input.ask("Willkommen beim Burgerbot! Was moechtest du gerne bestellen?");
//        while (!(inputLine.equals("Bestellung abschliessen") || inputLine.equals("Auf Wiedersehen"))) {
//            List<Integer> articles = articleIdsFromOrder(inputLine);
//            if(articles.isEmpty()) {
//                inputLine = input.ask("Entschuldigung, ich habe dich nicht verstanden. Waehle aus folgenden Zutaten: "
//                        + Menu.printAllArticles());
//            } else {
//                builder.addIngredientsById(articles);
//                Burger burger = builder.build();
//                inputLine = input.ask("In Ordnung. Dein Burger mit " + burger.getIngredients() +
//                        " kostet " + burger.calculatePrice() + " Euro. Willst du die Bestellung abschliessen?");
//            }
//        }
//        return inputLine;
//    }
//
//    // nur public zum einfacheren Testen
//    public List<Integer> articleIdsFromOrder(String inputLine) {
//        Set<String> articles = Menu.getAllArticles().keySet();
//        Map<String, Integer> articleCount = parser.countKeywords(inputLine, articles);
//        Map<String, Integer> articleMap = Menu.getAllArticles();
//        List<Integer> ids = new ArrayList<>();
//
//        for (Map.Entry<String, Integer> entry : articleCount.entrySet()) {
//            String articleName = entry.getKey();
//            int articleId = articleMap.get(articleName);
//            int count = entry.getValue();
//
//            for (int frequency = 0; frequency < count; frequency++) {
//                ids.add(articleId);
//            }
//        }
//
//        Collections.sort(ids);
//        return ids;
//    }
//
//


package SupermarketSystem.ui;

import java.util.*;

import SupermarketSystem.domain.IProduct;
import SupermarketSystem.domain.ShoppingCart;
import SupermarketSystem.service.ShoppingCartBuilder;
import SupermarketSystem.service.ArticleData;


public class ChatbotUI {
    private final UserInputWrapper input;
    private final ShoppingCartBuilder builder;
    private final InputParser parser;

    private static ArticleData data = ArticleData.getInstance();


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

        Set <String> articles = data.mapNameIds().keySet();
        Map<String, Integer> articleCount = parser.countKeywords(inputLine, articles);

        Map<String, Integer> articleMap;
        articleMap = data.mapNameIds();
        List<Integer> ids = new ArrayList<>();


        for (Map.Entry<String, Integer> entry : articleCount.entrySet()) {
            String articleName = entry.getKey();
            int articleId = articleMap.get(articleName);
            int count = entry.getValue();


            for (int frequency = 0; frequency < count; frequency++) {
                ids.add(articleId);

                //ids.add(articleIds);
            }
        }

        Collections.sort(ids);

        return ids;
    }
}
package SupermarketSystem.service;

import java.util.LinkedHashSet;
import java.util.Map;

public interface IArticleData {


    //Map<Integer, ArticleData> getAllArticles();
    // String printAllArticles();
    String getName();
    double getSalesPrice();
    double getPurchasePrice();

    // Wenn ich die Maps im Interface implementiere muss ich static rausnehmen
    // LinkedHashSet<String> getArticleNames ();

    // Map<Integer, String> getArticleIdName();

}

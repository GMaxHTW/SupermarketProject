package SupermarketSystem.service;

import SupermarketSystem.domain.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartBuilderImpl implements ShoppingCartBuilder{

    private final  List<IProduct> products;

    public ShoppingCartBuilderImpl () {
        this.products = new ArrayList<>();
    }


    @Override
    public boolean addArticlesById(List<Integer> ids) {

        ArticleData data = ArticleData.getInstance();

        for (Integer id : ids) {
            products.add(data.getAllArticles().get(id));
        }
        return false;
    }

    @Override
    public ShoppingCart build() {
        return new ShoppingCartImpl(products);
    }
}

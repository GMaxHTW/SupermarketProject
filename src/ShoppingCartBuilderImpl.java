import java.util.ArrayList;
import java.util.List;

public class ShoppingCartBuilderImpl implements ShoppingCartBuilder{

    private final  List<ProductInterface> products;

    public ShoppingCartBuilderImpl () {
        this.products = new ArrayList<>();
    }


    @Override
    public boolean addArticlesById(List<String> ids) {

        for (String id : ids) {

            if (ArticleData.getAllArticles().containsKey(id)) {

                AbstractProduct data = ArticleData.getAllArticles().get(id);

                if (ArticleData.foods.containsKey(id)) {
                    products.add(new Food (data.getName(), data.getSalesPrice(), data.getPurchasePrice()));
                }

                if (ArticleData.drinks.containsKey(id)) {
                    products.add(new Drink (data.getName(), data.getSalesPrice(), data.getPurchasePrice()));
                }

                if (ArticleData.drugStoreArticles.containsKey(id)) {
                    products.add(new DrugstoreArticle (data.getName(), data.getSalesPrice(), data.getPurchasePrice()));
                }



            }
        }

        return false;
    }

    @Override
    public ShoppingCart build() {
        return new ShoppingCartImpl(products);
    }
}

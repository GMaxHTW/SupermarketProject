package SupermarketSystem.service;

import java.util.List;
import SupermarketSystem.domain.ShoppingCart;

public interface ShoppingCartBuilder {

    boolean addArticlesById (List<Integer> ids);
    ShoppingCart build();


}

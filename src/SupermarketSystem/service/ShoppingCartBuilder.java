import java.util.List;
import ShoppingCart;

public interface ShoppingCartBuilder {

    boolean addArticlesById (List<Integer> ids);
    ShoppingCart build();


}

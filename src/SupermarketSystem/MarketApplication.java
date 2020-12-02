package SupermarketSystem;

import SupermarketSystem.service.ShoppingCartBuilder;
import SupermarketSystem.service.ShoppingCartBuilderImpl;
import SupermarketSystem.ui.ChatbotUI;
import SupermarketSystem.ui.CommaAndWhitespaceSplittingInputParser;
import SupermarketSystem.ui.UserInputWrapper;

public class MarketApplication {

    public static void main (String[] args)  {
        var parser = new CommaAndWhitespaceSplittingInputParser();
        var builder = new ShoppingCartBuilderImpl();
        var ui = new ChatbotUI(new UserInputWrapper(System.in, System.out), (ShoppingCartBuilder) builder, parser);
        ui.launch();
    }
}

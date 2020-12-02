public class MarketApplication {

    public static void main (String[] args)  {
        var parser = new CommaAndWhitespaceSplittingInputParser();
        var builder = new ShoppingCartBuilderImpl();
        var ui = new ChatbotUI(new UserInputWrapper(System.in, System.out), (ShoppingCartBuilder) builder, parser);
        ui.launch();
    }
}

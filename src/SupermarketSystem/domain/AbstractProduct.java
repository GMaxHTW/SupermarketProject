public abstract class AbstractProduct implements ProductInterface {

    // Attribute Supermarkt Produkte
    private String name;
    private double salesPrice;
    private double purchasePrice;

    // Konstruktor abstrakte Klasse
    public AbstractProduct (String name, double salesPrice, double purchasePrice) {
        this.name = name;
        this.salesPrice = salesPrice;
        this.purchasePrice = purchasePrice;
    }


    public void compareSalesPrice (AbstractProduct productToCompare) {
        if (this.salesPrice > productToCompare.salesPrice) {
            double priceDifference = this.salesPrice - productToCompare.salesPrice;
            System.out.println("Das Produkt " + this.getName() + " ist " + priceDifference + " € teurer als das Produkt " + productToCompare.name);
        }
    }

    public void calculateProfit () {
        double profit = this.salesPrice - this.purchasePrice;
        System.out.println("Bei dem Produkt " + this.name + " liegt der Gewinn pro verkauftem Artikel liegt bei: " + profit + "€.");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalesPrice() {
        return salesPrice;
    }

    @Override
    public double getPurchasePrice() {
        return purchasePrice;
    }

}

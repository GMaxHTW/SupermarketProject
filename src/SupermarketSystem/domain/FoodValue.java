package SupermarketSystem.domain;

public class FoodValue {

    /**
     * Calorific value
     * fat
     * carbohydrates
     * sugar
     * Fiber
     * protein
     * salt
     * ingredients
     */
    private double calorficValue;
    private double fat;
    private double saturatedFat;
    private double carbohydrates;
    private double sugar;
    private double fiber;
    private double protein;
    private double salt;
    private double weight;
    // private String [] ingredients;,

    public FoodValue (double calorficValue, double fat, double saturatedFat, double carbohydrates,
                      double sugar,double protein, double fiber,  double salt, double weight) {
        this.calorficValue = calorficValue;
        this.fat = fat;
        this.saturatedFat = saturatedFat;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.protein = protein;
        this.fiber = fiber;
        this.salt = salt;
        this.weight = weight;
    }


}

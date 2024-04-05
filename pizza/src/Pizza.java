public class Pizza {
    protected static final double SMALL_PRICE = 14.25;
    protected static final double MEDIUM_PRICE = 14.50;
    protected static final double LARGE_PRICE = 14.70;

    protected String[] toppings;
    protected double basePrice;
    protected double price;

    public Pizza(String[] toppings, double basePrice){
        this.toppings = toppings;
        this.basePrice = basePrice;
        calculatePrice();
    }

    protected void calculatePrice() {
        this.price = basePrice + (toppings.length * 2);
    }

    public double getPrice() {
        return price;
    }
}


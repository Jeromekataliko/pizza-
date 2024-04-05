public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private static final double LESS_COSTLY_DELIVERY_FEE = 5;
    private static final double COSTLY_DELIVERY_FEE = 3;

    public DeliveryPizza(String[] toppings, double basePrice){
        super(toppings, basePrice);
        calculateDeliveryFee();
    }

    private void calculateDeliveryFee(){
        deliveryFee = super.getPrice() > 18 ? COSTLY_DELIVERY_FEE : LESS_COSTLY_DELIVERY_FEE;
        super.price += deliveryFee; // adjust price based on delivery fee
    }
}


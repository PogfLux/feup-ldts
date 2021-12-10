package pt.up.fe.ldts.example3;

public class FixedDiscount implements Discount{
    private int fixed;

    public FixedDiscount(int fixed){
        this.fixed = fixed;
    }

    @Override
    public double applyDiscount(double price) {
        double discountedPrice = price;
        return discountedPrice = fixed > price ? 0 : price - fixed;
    }
}

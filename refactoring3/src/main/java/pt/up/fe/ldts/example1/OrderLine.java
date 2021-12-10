package pt.up.fe.ldts.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.setProduct(product);
        this.setQuantity(quantity);
    }

    public double getTotal() {
        return this.getProduct().getPrice() * this.getQuantity();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOutput(){
        return getProduct().getName() + "(x" + getQuantity() + "): " + (getProduct().getPrice() * getQuantity());
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

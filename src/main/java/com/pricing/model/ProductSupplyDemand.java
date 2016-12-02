package main.java.com.pricing.model;

public class ProductSupplyDemand {
    private char supplyIndicator;
    private char demandIndicator;
    private Product product;

    public ProductSupplyDemand(Product p,char si,char di){
        this.product=p;
        this.supplyIndicator=si;
        this.demandIndicator=di;
    }
    public char getDemandIndicator() {
        return demandIndicator;
    }

    public char getSupplyIndicator() {
        return supplyIndicator;
    }

    public Product getProduct() {
        return product;
    }
}

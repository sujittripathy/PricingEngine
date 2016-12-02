package main.java.com.pricing.model;

public class CompetitorPricingDetails {
    private String competitorName;
    private double price;
    private Product product;

    public CompetitorPricingDetails(Product product,String competitorName,double price){
       this.product=product;
        this.competitorName=competitorName;
        this.price=price;
    }
    public double getPrice() {
        return price;
    }

    public String getCompetitorName() {
        return competitorName;
    }

    public Product getProduct() {
        return product;
    }

}

package test;

import main.java.com.pricing.PriceFinder;
import main.java.com.pricing.input.CompetitorPricingInput;
import main.java.com.pricing.model.CompetitorPricingDetails;
import main.java.com.pricing.model.Product;
import main.java.com.pricing.model.ProductSupplyDemand;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class PriceFinderTest {

    @Test
    public void findPrice(){
        Assert.assertEquals("Hello","Hello");
        CompetitorPricingInput input=new CompetitorPricingInput();

        input.setNumberOfProducts(2);
        ProductSupplyDemand product1=new ProductSupplyDemand(new Product("flashdrive"),'H','H');
        ProductSupplyDemand product2=new ProductSupplyDemand(new Product("ssd"),'L','H');

        ArrayList<ProductSupplyDemand> supplyDemandArrayList=new ArrayList<>();
        supplyDemandArrayList.add(product1);
        supplyDemandArrayList.add(product2);

        input.setNumberOfSurveyedPrices(5);
        CompetitorPricingDetails comp1=new CompetitorPricingDetails(new Product("flashdrive"),"X",1.0);
        CompetitorPricingDetails comp2=new CompetitorPricingDetails(new Product("ssd"),"X",10.0);
        CompetitorPricingDetails comp3=new CompetitorPricingDetails(new Product("flashdrive"),"Y",0.9);
        CompetitorPricingDetails comp4=new CompetitorPricingDetails(new Product("flashdrive"),"Z",1.1);
        CompetitorPricingDetails comp5=new CompetitorPricingDetails(new Product("ssd"),"Y",12.5);

        ArrayList<CompetitorPricingDetails> compPriceDetails= new ArrayList<CompetitorPricingDetails>();
        compPriceDetails.add(comp1);
        compPriceDetails.add(comp2);
        compPriceDetails.add(comp3);
        compPriceDetails.add(comp4);
        compPriceDetails.add(comp5);

        input.setSupplyDemandInput(supplyDemandArrayList);
        input.setCompetitorPricingInput(compPriceDetails);

        new PriceFinder().findMatchingPrice(input);
    }
}

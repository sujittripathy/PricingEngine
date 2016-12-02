package main.java.com.pricing;


import com.sun.tools.jdi.DoubleValueImpl;
import main.java.com.pricing.config.SupplyDemandConfig;
import main.java.com.pricing.input.CompetitorPricingInput;
import main.java.com.pricing.model.CompetitorPricingDetails;
import main.java.com.pricing.model.ProductSupplyDemand;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PriceFinder {
    /*public static void main(String... args) {

    }*/

    public void findMatchingPrice(CompetitorPricingInput competitorPricingInput){
        int numProduct=competitorPricingInput.getNumberOfProducts();
        competitorPricingInput.getSupplyDemandInput().forEach(product -> {
            String product_name = product.getProduct().getProductName();
            List<CompetitorPricingDetails> filterSurveyPriceList= competitorPricingInput.getCompetitorPricingInput()
                        .stream()
                        .filter(pi -> product_name.equalsIgnoreCase(pi.getProduct().getProductName()))
                        .collect(Collectors.toList());
           // System.out.println(product_name);
            //System.out.println(filterSurveyPriceList);
            calculatePriceForProduct(product,filterSurveyPriceList);
        });
    }

    private int calculatePriceForProduct(ProductSupplyDemand psd,List<CompetitorPricingDetails> cpd){
        //Iterate through all competitor prices and choose the lowest if repeated
        // If not repeated then just identify the lowest
        double price_min=cpd.stream().mapToDouble(CompetitorPricingDetails::getPrice).min().getAsDouble();

        // Find the average price of the competitor product prices
        double avg=cpd.stream().mapToDouble(CompetitorPricingDetails::getPrice).average().getAsDouble();
        //Look up the price value from Supply Demand Configuration
        String sdLookup=String.valueOf(psd.getSupplyIndicator()).concat(String.valueOf(psd.getDemandIndicator()));
        System.out.println(SupplyDemandConfig.getSupplyDemandConfigForProduct(sdLookup));
        // Apply the price

        cpd.stream().forEach(a-> System.out.println(a.getProduct().getProductName()));
        return 0;
    }

}

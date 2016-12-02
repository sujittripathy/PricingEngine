package main.java.com.pricing.input;

import main.java.com.pricing.model.CompetitorPricingDetails;
import main.java.com.pricing.model.ProductSupplyDemand;
import java.util.List;

public class CompetitorPricingInput {
    private int numberOfProducts;
    private int numberOfSurveyedPrices;
    private List<ProductSupplyDemand> supplyDemandInput;
    private List<CompetitorPricingDetails> competitorPricingInput;

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getNumberOfSurveyedPrices() {
        return numberOfSurveyedPrices;
    }

    public void setNumberOfSurveyedPrices(int numberOfSurveyedPrices) {
        this.numberOfSurveyedPrices = numberOfSurveyedPrices;
    }

    public List<ProductSupplyDemand> getSupplyDemandInput() {
        return supplyDemandInput;
    }

    public void setSupplyDemandInput(List<ProductSupplyDemand> supplyDemandInput) {
        this.supplyDemandInput = supplyDemandInput;
    }

    public List<CompetitorPricingDetails> getCompetitorPricingInput() {
        return competitorPricingInput;
    }

    public void setCompetitorPricingInput(List<CompetitorPricingDetails> competitorPricingInput) {
        this.competitorPricingInput = competitorPricingInput;
    }
}

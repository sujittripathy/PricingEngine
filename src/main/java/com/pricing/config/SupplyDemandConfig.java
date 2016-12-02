package main.java.com.pricing.config;

public class SupplyDemandConfig {

    public static int getSupplyDemandConfigForProduct(String sdValue){
        int percentDiff = -100;
        switch (sdValue){
            case "HH":
                percentDiff = 0;
                break;
            case "LL":
                percentDiff = +10;
                break;
            case "LH":
                percentDiff = +5;
                break;
            case "HL":
                percentDiff = -5;
                break;
        }
        return percentDiff;
    }
}

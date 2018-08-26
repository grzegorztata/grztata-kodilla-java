package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Contractor {
    private static String ContractorName = "ExtraFoodShop";

    public String getContractorName() {
        return ContractorName;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "ContractorName='" + ContractorName + '\'' +
                '}';
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        return true;
    }
}

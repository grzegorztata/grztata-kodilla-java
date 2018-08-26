package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements Contractor {
    private static String ContractorName = "GlutenFreeShop";

    public String getContractorName() {
        return ContractorName;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
                "ContractorName='" + ContractorName + '\'' +
                '}';
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        return true;
    }
}

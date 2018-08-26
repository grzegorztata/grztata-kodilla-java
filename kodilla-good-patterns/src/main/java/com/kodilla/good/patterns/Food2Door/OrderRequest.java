package com.kodilla.good.patterns.Food2Door;

public class OrderRequest { //info o dostawcy, produkt, ilość

    private Contractor contractor;
    private Product product;
    private int quantity;

    public OrderRequest(Contractor contractor, Product product, int quantity) {
        this.contractor = contractor;
        this.product = product;
        this.quantity = quantity;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "contractor=" + contractor +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}

package com.kodilla.good.patterns.food2Door;

public class OrderRequestRetriever {
    private ExtraFoodShop extraFoodShop;

    public OrderRequest retrieve() {
        Supplier supplier = extraFoodShop;
        Product product = new Product("Shrimps", 40);
        Double quantity = 2.0;

        return new OrderRequest(supplier, product, quantity);
    }
}

package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {
    private Map<Integer, Product> productsMap;

    public HealthyShop(Map<Integer, Product> productsMap) {
        this.productsMap = productsMap;
    }

    private Map<Integer, Product> createProductsMap() {
        productsMap = new HashMap<>();

        productsMap.put(1, new Product("Finnish xylitol", 15));
        productsMap.put(2, new Product("Black lentils", 20));
        productsMap.put(3, new Product("Freeze-dried cranberry", 12));
        productsMap.put(4, new Product("black cumin oil", 20));

        return productsMap;
    }

    @Override
    public boolean process(OrderRequest orderRequest) throws ProductNotFoundException {
        for (int i = 0; i < productsMap.size(); i++) {
            if (orderRequest.getProduct().getProductName().equals(productsMap.get(i).getProductName())) {
                System.out.println("Order in HealthyShop has been placed.");
                return true;
            } else throw new ProductNotFoundException("Product " + orderRequest.getProduct() + " was not found.");
        } return false;
    }
}
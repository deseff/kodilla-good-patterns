package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
        Optional<Product> productOptional = productsMap.entrySet().stream()
                .flatMap()
//                .flatMap(productInMap -> productInMap.getValue())
//                .filter(productInList -> productInList.getProductName().equals(orderRequest.getProduct().getProductName()))
                .findAny();

        if (productOptional.isPresent()) {
            System.out.println("Order in HealthyShop has been placed.");
            return true;
        }
        throw new ProductNotFoundException("Product " + orderRequest.getProduct().getProductName() + " was not found.");
    }
    }
}
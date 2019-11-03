package com.kodilla.good.patterns.food2Door;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException (String errorMessage) {
        super(errorMessage);
    }
}

package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Supplier {
    private ArrayList<Product> productsList;
    private Product product;
//    private OrderRequest orderRequest;

    public ExtraFoodShop(ArrayList<Product> productsList) {
        productsList = productsList;
    }

    private List<Product> createProductsList() {
        productsList = new ArrayList<>();

        productsList.add(new Product("Shrimps", 40));
        productsList.add(new Product("Caviar", 100));
        productsList.add(new Product("Saffron", 30));
        productsList.add(new Product("Clams", 50));

        return productsList;
    }

    @Override
    public boolean process(OrderRequest orderRequest) throws ProductNotFoundException {
        for (int i = 0; i < productsList.size(); i++) {
            if (orderRequest.getProduct().getProductName().equals(productsList.get(i))) {
                System.out.println("Order in ExtraFoodShop has been placed.");
                return true;
            } else throw new ProductNotFoundException("Product " + orderRequest.getProduct() + " was not found.");
        } return false;
    }
}

package com.kodilla.good.patterns.food2Door;

import java.util.LinkedList;
import java.util.List;

public class GlutenFreeShop implements Supplier {
    private LinkedList<Product> productsList;

    public GlutenFreeShop(LinkedList<Product> productsList) {
        this.productsList = productsList;
    }

    private List<Product> createProductsList() {
        productsList = new LinkedList<>();

        productsList.add(new Product("Maize bread", 5));
        productsList.add(new Product("Glutenfree oat flakes", 7));
        productsList.add(new Product("Millet", 8));
        productsList.add(new Product("Gluten free cakes", 4));

        return productsList;
    }


    @Override
    public boolean process(OrderRequest orderRequest) throws ProductNotFoundException {
        for (int i = 0; i < productsList.size(); i++) {
            if (orderRequest.getProduct().getProductName().equals(productsList.get(i))) {
                System.out.println("Order in GlutenFreeShop has been placed.");
                return true;
            } else throw new ProductNotFoundException("Product " + orderRequest.getProduct() + " was not found.");
        } return false;
    }
}

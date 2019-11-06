package com.kodilla.good.patterns.food2Door;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class GlutenFreeShop implements Supplier {
    private LinkedList<Product> productsList;

    public GlutenFreeShop(LinkedList<Product> productsList) {
        this.productsList = productsList;
    }

    private List<Product> createProductsList() {
        productsList = new LinkedList<>();

        productsList.add(new Product("Maize bread", 5));
        productsList.add(new Product("Gluten free oat flakes", 7));
        productsList.add(new Product("Millet", 8));
        productsList.add(new Product("Gluten free cakes", 4));

        return productsList;
    }


    @Override
    public boolean process(OrderRequest orderRequest) throws ProductNotFoundException {
        Optional<Product> productOptional = productsList.stream()
                .filter(productInList -> productInList.getProductName().equals(orderRequest.getProduct().getProductName()))
                .findAny();

        if (productOptional.isPresent()) {
            System.out.println("Order in GlutenFreeShop has been placed.");
            return true;
        }
        throw new ProductNotFoundException("Product " + orderRequest.getProduct().getProductName() + " was not found.");
    }
}

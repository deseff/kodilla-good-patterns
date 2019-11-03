package com.kodilla.good.patterns.food2Door;

public class OrderDto {
    String product;
    private double quantity;

    public OrderDto(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public enum ShopTypeEnum {
        EXTRA_FOOD_SHOP,
        GLUTEN_FREE_SHOP,
        HEALTHY_SHOP
    }

   /* public String getShopTypeEnum() {

    }*/

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}

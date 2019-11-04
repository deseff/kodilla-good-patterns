package com.kodilla.good.patterns.food2Door;

public class OrderDto {
    private Supplier supplier;
    private String product;
    private double quantity;
    private ShopTypeEnum shopTypeEnum;

    public OrderDto(Supplier supplier, String product, double quantity, ShopTypeEnum shopTypeEnum) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
        this.shopTypeEnum = shopTypeEnum;
    }

    public enum ShopTypeEnum {
        EXTRA_FOOD_SHOP,
        GLUTEN_FREE_SHOP,
        HEALTHY_SHOP
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public ShopTypeEnum getShopTypeEnum() {
        return shopTypeEnum;
    }
}

package com.kodilla.good.patterns.food2Door;

public class OrderDto {
//    private Supplier supplier;
    private String product;
    private double quantity;
    private ShopTypeEnum shopTypeEnum;
    private boolean isOrdered;

    public OrderDto(/*Supplier supplier,*/ String product, double quantity, ShopTypeEnum shopTypeEnum, boolean isOrdered) {
//        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
        this.shopTypeEnum = shopTypeEnum;
        this.isOrdered = isOrdered;
    }

//    public Supplier getSupplier() {
//        return supplier;
//    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public ShopTypeEnum getShopTypeEnum() {
        return shopTypeEnum;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}


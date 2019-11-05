package com.kodilla.good.patterns.food2Door;

public class OrderProcessor {
    OrderRequest orderRequest;
    private final ExtraFoodShop extraFoodShop;
    private final GlutenFreeShop glutenFreeShop;
    private final HealthyShop healthyShop;

    public OrderProcessor(ExtraFoodShop extraFoodShop, GlutenFreeShop glutenFreeShop, HealthyShop healthyShop) {
        this.extraFoodShop = extraFoodShop;
        this.glutenFreeShop = glutenFreeShop;
        this.healthyShop = healthyShop;
    }

    void processOrder (OrderDto orderDto) {
//        Supplier supplier = orderDto.getSupplier();
        double quantity = orderDto.getQuantity();
        String product = orderDto.getProduct();

        switch (orderDto.getShopTypeEnum()) {
            case EXTRA_FOOD_SHOP:
                extraFoodShop.process(orderRequest);

            case GLUTEN_FREE_SHOP:
                glutenFreeShop.process(orderRequest);

            case HEALTHY_SHOP:
                healthyShop.process(orderRequest);

            default:
                throw new ShopNotFoundException("Shop not found");
        }
    }
}

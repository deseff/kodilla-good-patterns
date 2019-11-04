package com.kodilla.good.patterns.food2Door;

public class Application {

    public static void main(String[] args) throws ProductNotFoundException, ShopNotFoundException {

        OrderDto orderDto;
        OrderRequest orderRequest;
        ExtraFoodShop extraFoodShop;
        GlutenFreeShop glutenFreeShop;
        HealthyShop healthyShop;

        /*void processOrder (OrderDto orderDto) {
            Supplier supplier = orderDto.getSupplier();
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
        }*/
    }
}

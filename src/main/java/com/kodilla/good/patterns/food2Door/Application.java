package com.kodilla.good.patterns.food2Door;

public class Application {
    ExtraFoodShop extraFoodShop;
    GlutenFreeShop glutenFreeShop;
    HealthyShop healthyShop;

    public static void main(String[] args) throws ProductNotFoundException, ShopNotFoundException {

        OrderProcessor orderProcessor = new OrderProcessor();

        OrderDto orderDto = new OrderDto();

        orderProcessor.processOrder(orderDto);



    }
}

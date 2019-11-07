package com.kodilla.good.patterns.food2Door;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderDto orderDto = new OrderDto(orderRequest.getShopTypeEnum());

        OrderProcessor orderProcessor = new OrderProcessor(new FoodOrderService());
        orderProcessor.processOrder(orderDto);
    }
}
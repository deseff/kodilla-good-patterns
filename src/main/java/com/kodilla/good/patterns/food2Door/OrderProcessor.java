package com.kodilla.good.patterns.food2Door;

public class OrderProcessor {
    private OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    void processOrder(OrderDto orderDto) {

        switch (orderDto.getShopTypeEnum()) {
            case EXTRA_FOOD_SHOP:
                ExtraFoodShop extraFoodShop = new ExtraFoodShop();
                extraFoodShop.process(orderRequest);

            case GLUTEN_FREE_SHOP:
                GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
                glutenFreeShop.process(orderRequest);

            case HEALTHY_SHOP:
                HealthyShop healthyShop = new HealthyShop();
                healthyShop.process(orderRequest);

            default:
                throw new ShopNotFoundException("Shop not found");
        }
    }
}

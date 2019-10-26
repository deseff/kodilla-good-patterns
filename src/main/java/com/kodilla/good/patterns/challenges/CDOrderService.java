package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class CDOrderService implements OrderService {

    @Override
    public boolean order(User user, LocalDateTime orderDate, Product product, Double quantity) {
        return true;
    }
}

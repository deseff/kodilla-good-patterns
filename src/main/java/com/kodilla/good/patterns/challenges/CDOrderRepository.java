package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class CDOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime orderDate) {
        return true;
    }
}

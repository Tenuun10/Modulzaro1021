package com.example.modulzaro1021.service;

import com.example.modulzaro1021.model.OrderDetails;
import com.example.modulzaro1021.repository.OrderDetailsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class OrderDetailsService {
    private final OrderDetailsRepo orderDetailsRepo;

    public void saveOrder(OrderDetails order) {
        orderDetailsRepo.save(order);
    }

    public List<OrderDetails> showPeople() {
        return orderDetailsRepo.findAll();
    }
}

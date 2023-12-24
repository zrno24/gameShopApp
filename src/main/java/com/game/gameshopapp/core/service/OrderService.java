package com.game.gameshopapp.core.service;

import com.game.gameshopapp.core.exceptions.repository.ResourceNotFoundException;
import com.game.gameshopapp.core.model.Order;
import com.game.gameshopapp.core.repository.OrderRepository;
import com.game.gameshopapp.rest.dto.OrderDTO;
import com.game.gameshopapp.rest.dto.OrderRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders;
    }

    public Order findOrderById(String id) {
        Optional<Order> order = orderRepository.findOrderById(id);
        if(order.isEmpty()) {
            throw new ResourceNotFoundException("THe order with the given ID does not exist.");
        }
        return order.get();
    }

    public Order findOrderByTotalRate(double totalRate) {
        Optional<Order> order = orderRepository.findByTotalRate(totalRate);
        if(order.isEmpty()) {
            throw new ResourceNotFoundException("The order with the given title does not exist.");
        }
        return order.get();
    }

    public Order addOrder(OrderRequestDTO payload) {
        return orderRepository.save(payload.toEntity());
    }


}

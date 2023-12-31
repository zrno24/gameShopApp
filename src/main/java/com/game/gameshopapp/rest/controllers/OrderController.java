package com.game.gameshopapp.rest.controllers;

import com.game.gameshopapp.core.model.Order;
import com.game.gameshopapp.core.service.OrderService;
import com.game.gameshopapp.rest.dto.OrderRequestDTO;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
@SecurityRequirement(name = "JWT Security")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Order> getOrderByID(@PathVariable String id) {
        return ResponseEntity.ok(orderService.findOrderById(id));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{title}")
    public ResponseEntity<Order> findOrderByTotalRate(@PathVariable double totalRate) {
        return ResponseEntity.ok(orderService.findOrderByTotalRate(totalRate));
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addOrder")
    public ResponseEntity<Order> addOrder(@RequestBody OrderRequestDTO order) {
        return ResponseEntity.ok(orderService.addOrder(order));
    }


}

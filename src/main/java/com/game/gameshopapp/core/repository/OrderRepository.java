package com.game.gameshopapp.core.repository;

import com.game.gameshopapp.core.model.Order;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {



    Optional<Order> findOrderById(String id);

    Optional<Order> findByTotalRate(double totalRate);



}

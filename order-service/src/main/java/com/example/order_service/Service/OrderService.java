package com.example.order_service.Service;

import com.example.order_service.Entity.Order;
import com.example.order_service.Repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class OrderService {

        private OrderRepository orderRepository;
        public OrderService(OrderRepository orderRepository) {
            this.orderRepository = orderRepository;
        }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(int id) {
        return orderRepository.findById(id);
    }

    public boolean addOrder(Order order) {
            // if (product service get by id) quantity >= order quantity
            // return true
            // else return false
            orderRepository.save(order);
            return true;
        }
    }

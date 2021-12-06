/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2_C4.Repository;

import Reto2_C4.Model.Order;
import Reto2_C4.Interfaces.OrderInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabrielroa
 */
@Repository
public class OrderRepository {
    @Autowired(required=true)
    private OrderInterface orderRepository;

    public List<Order> getAll() {
        return (List<Order>) orderRepository.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderRepository.findById(id);
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }

    public void update(Order order) {
        orderRepository.save(order);
    }

    public void delete(Order order) {
        orderRepository.delete(order);
    }
    
    public Optional<Order> lastUserId(){
        return orderRepository.findTopByOrderByIdDesc();
    }
    
}

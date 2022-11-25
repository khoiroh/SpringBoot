package com.data.tokoonline.service;

import com.data.tokoonline.exception.EmailCondition;
import com.data.tokoonline.exception.InternalEror;
import com.data.tokoonline.exception.NotFoundException;
import com.data.tokoonline.model.Order;
import com.data.tokoonline.model.User;
import com.data.tokoonline.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order addOrder(Order order) {
        if (orderRepository.findByPemilik(order.getPemilik()).isPresent()) {
            throw new EmailCondition("Email already exist");
        }
        return orderRepository.save(order);
    }

    @Override
    public Object getOrderById(Long id) {
        var Order = orderRepository.findById(id).orElseThrow(() -> new NotFoundException("Id tidak ditemukan"));
        try {
            return orderRepository.findById(id);
        } catch (Exception e) {
            throw new InternalEror("Kesalahan memunculkan data");
        }
    }

    @Override
    public Object editOrderById(Long id, String namaBarang, String harga, String pemilik) {
        Order order = (Order) orderRepository.findById(id).get();
        order.setNamaBarang(namaBarang);
        order.setHarga(harga);
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Object getAllOrder() {
        try {
            return orderRepository.findAll();
        } catch (Exception e) {
            return "kesalahan memunculkan data";
        }
    }

}

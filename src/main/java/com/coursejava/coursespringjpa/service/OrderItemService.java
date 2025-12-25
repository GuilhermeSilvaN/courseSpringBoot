package com.coursejava.coursespringjpa.service;

import com.coursejava.coursespringjpa.models.OrderItem;
import com.coursejava.coursespringjpa.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;


}

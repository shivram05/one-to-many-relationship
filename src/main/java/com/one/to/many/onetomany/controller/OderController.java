package com.one.to.many.onetomany.controller;

import com.one.to.many.onetomany.dto.OrderRequest;
import com.one.to.many.onetomany.entity.Customer;
import com.one.to.many.onetomany.repository.CustomerRepository;
import com.one.to.many.onetomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest){
       return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> getAllCustomerList(){

       return customerRepository.findAll();
    }
}

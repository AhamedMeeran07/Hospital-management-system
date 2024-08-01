package com.UnityHospital.Hospital_management_system.customer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    private static final List<Customer> CUSTOMERS= List.of(
            new Customer(1L,"JOHN","DOM","johndom@gmail.com"),
            new Customer(2L,"AHAMED","MEERAN","ahamed@gmail.com"),
            new Customer(3L,"DEVA","RAJ","deva@gmail.com"),
        new Customer(4L,"RAVIN","PAUL","ravin@gmail.com")

    );
    @GetMapping
public List<Customer> findAllCustomers(){
    return CUSTOMERS;
}



}

package com.UnityHospital.Hospital_management_system.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private Long customerId;

    private String firstName;

    private String lastname;

    private String email;
}

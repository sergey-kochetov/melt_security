package ru.melt.security.sevice;

import ru.melt.security.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
}

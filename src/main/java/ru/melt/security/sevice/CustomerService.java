package ru.melt.security.sevice;

import ru.melt.security.entity.Customer;

import java.util.List;

public interface CustomerService {

    void save(Customer customer);

    Customer getById(int id);

    void deleteById(int id);

    void update(Customer customer);

    List<Customer> findAll();
}

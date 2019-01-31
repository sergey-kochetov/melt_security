package ru.melt.security.dao;

import ru.melt.security.entity.Customer;

import java.util.List;

public interface CustomerDao {

    void save(Customer customer);

    Customer getById(int id);

    void deleteById(int id);

    void update(Customer customer);

    List<Customer> findAll();
}

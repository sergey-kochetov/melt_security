package ru.melt.security.dao;

import ru.melt.security.entity.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> findAll();
}

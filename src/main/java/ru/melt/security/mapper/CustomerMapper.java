package ru.melt.security.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.melt.security.entity.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setId(resultSet.getInt("id"));
        customer.setName(resultSet.getString("name"));
        customer.setEmail(resultSet.getString("email"));
        customer.setAge(resultSet.getInt("age"));

        return customer;
    }
}

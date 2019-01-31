package ru.melt.security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.melt.security.entity.Customer;
import ru.melt.security.mapper.CustomerMapper;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Customer customer) {
        String sql = "INSERT INTO customer(name, email, age) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, customer.getName(), customer.getEmail(), customer.getAge());
    }

    @Override
    public Customer getById(int id) {
        String sql = "SELECT * FROM customer WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new CustomerMapper(), id);
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM customer WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void update(Customer customer) {
        String sql = "UPDATE customer SET name=?, email=?, age=? WEHERE id=?";
        jdbcTemplate.update(sql, customer.getName(), customer.getEmail(), customer.getAge(), customer.getId());

    }

    public List<Customer> findAll() {
        String sql = "SELECT * FROM customer";
        return jdbcTemplate.query(sql, new CustomerMapper());
    }
}

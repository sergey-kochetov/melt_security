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

    public List<Customer> findAll() {
        String sql = "SELECT * FROM customer";
        return jdbcTemplate.query(sql, new CustomerMapper());
    }
}

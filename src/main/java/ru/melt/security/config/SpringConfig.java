package ru.melt.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.melt.security.dao.CustomerDao;
import ru.melt.security.dao.CustomerDaoImpl;
import ru.melt.security.sevice.CustomerService;
import ru.melt.security.sevice.CustomerServiceImpl;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }
    
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/melt_security");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
        return dataSource;
    }

    @Bean
    public CustomerService getCustomerService() {
        return new CustomerServiceImpl();
    }

    @Bean
    public CustomerDao getCustomerDao() {
        return new CustomerDaoImpl(getJdbcTemplate());
    }

}

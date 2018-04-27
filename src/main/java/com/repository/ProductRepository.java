package com.repository;

import com.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class ProductRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);

    public int removeProductById(Integer pid) {
        final String sql = "delete from product where pid = ?";
        return jdbcTemplate.update(sql , pid);
    }


    @Transactional(readOnly = true)
    public List<Product> getProductsByIndex(Integer index , Integer size) {

        String sql = "select pid , pname , price , description , imgs  from product limit ? , ?  ";

        return  jdbcTemplate.query(sql , new Object[]{ index , size} , rowMapper);
    }



    @Transactional(readOnly = true)
    public List<Product> getProducts() {
        final String sql = "select pid , pname , price , description , imgs  from product";

        return jdbcTemplate.query(sql, rowMapper);
    }


    public Product saveProduct(Product product) {
        final String sql = "insert into product (pname , price , description ) values (? , ? , ? )";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        int rows = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql , PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, product.getPname());
                ps.setBigDecimal(2, product.getPrice());
                ps.setString(3 , product.getDescription());
                return ps;
            }
        } , keyHolder);

        if(rows>0) {
                product.setPid(keyHolder.getKey().intValue());
                return product;
        } else {
            return null;
        }
    }

}

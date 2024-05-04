package com.apirest.apirest.Repository;

import com.apirest.apirest.Entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


    @Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2 ")
    List<Product> findProductByInRange(BigDecimal minPrice, BigDecimal maxPrice);
    //este seria usando ya sql de jpa

    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice); // esto es un cueri metod
}

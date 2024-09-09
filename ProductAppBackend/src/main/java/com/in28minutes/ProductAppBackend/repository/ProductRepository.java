package com.in28minutes.ProductAppBackend.repository;


import com.in28minutes.ProductAppBackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

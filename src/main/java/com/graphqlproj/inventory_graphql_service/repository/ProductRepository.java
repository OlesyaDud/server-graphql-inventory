package com.graphqlproj.inventory_graphql_service.repository;

import com.graphqlproj.inventory_graphql_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategory(String category);
}

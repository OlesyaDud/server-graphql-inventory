package com.graphqlproj.inventory_graphql_service.service;


import com.graphqlproj.inventory_graphql_service.entity.Product;
import com.graphqlproj.inventory_graphql_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public List<Product> getProductsByCategory(String category){
        return repository.findByCategory(category);
    }

    public Product updateStock(int id, int quantity){
//        get a product first
        Product existingProduct=repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found with the id " + id));
//        update stock count on existing product found
        existingProduct.setStock(quantity);

        return repository.save(existingProduct);
    }


    public Product receiveNewShipment(int id, int stock){
//        get a product first
        Product existingProduct=repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found with the id " + id));

        existingProduct.setStock(existingProduct.getStock()+stock );
        return repository.save(existingProduct);

    }

}

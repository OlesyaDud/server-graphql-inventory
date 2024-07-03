package com.graphqlproj.inventory_graphql_service;

import com.graphqlproj.inventory_graphql_service.entity.Product;
import com.graphqlproj.inventory_graphql_service.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class InventoryGraphqlServiceApplication {

//	@Autowired
//	private ProductRepository repository;
//

//	will run on app startup and save to db
//	@PostConstruct
//	public void initDB(){
//		List<Product> products = Stream.of(
//				new Product("Product 1", "Category1", (float) 300.99, 6),
//				new Product("Product 2", "Category1", (float) 200.99, 3),
//				new Product("Product 3", "Category2", (float) 30.99, 1),
//				new Product("Product 4", "Category3", (float) 100.99, 7),
//				new Product("Product 5", "Category3", (float) 50.99, 2)
//		).collect(Collectors.toList());
//
//		repository.saveAll(products);
//	}

	public static void main(String[] args) {
		SpringApplication.run(InventoryGraphqlServiceApplication.class, args);
	}

}

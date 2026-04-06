package com.test.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.test.entity.Product;

public interface ProductDao {
	Product saveProduct(Product obj);
	Product getProductById(int id);
	Product updateProductById(Product obj);
	List<Product> deleteProductById(int id);
	List<Product> getAllProducts();
	List<Product> getProductsByName(String name);
	List<Product> getProductByQuantity(int qunty);
	List<Product> getProductByNameQP(String name);
	List<Product> getProductsByQuantityQP(int qnty);
	List<Product> getAllProductsByNameASC();
}

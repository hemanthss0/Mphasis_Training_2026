package com.test.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ProductDao;
import com.test.entity.Product;
import com.test.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	@Override
	public Product saveProduct(Product obj) {
		// TODO Auto-generated method stub
		return productDao.saveProduct(obj);
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}

	@Override
	public Product updateProductById(Product obj) {
		// TODO Auto-generated method stub
		return productDao.saveProduct(obj);
	}

	@Override
	public List<Product> deleteProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.deleteProductById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public List<Product> getProductsByName(String name) {
		// TODO Auto-generated method stub
		return productDao.getProductsByName(name);
	}

	@Override
	public List<Product> getProductByQuantity(int qunty) {
		// TODO Auto-generated method stub
		return productDao.getProductByQuantity(qunty);
	}

	@Override
	public List<Product> getProductByNameQP(String name) {
		// TODO Auto-generated method stub
		return productDao.getProductByNameQP(name);
	}

	@Override
	public List<Product> getProductsByQuantityQP(int qnty) {
		// TODO Auto-generated method stub
		return productDao.getProductsByQuantityQP(qnty);
	}

	@Override
	public List<Product> getAllProductsByNameASC() {
		// TODO Auto-generated method stub
		return productDao.getAllProductsByNameASC();
	}

}

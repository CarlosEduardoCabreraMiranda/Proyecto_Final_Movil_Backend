package services;

import java.util.List;

import entities.Product;

public interface ProductServices {
	
	String addProduct(Product u);
	Product getProductById(int id);
	List<Product>getProducts();
	void removeProduct(int id);
	void updateProduct(Product product);

}

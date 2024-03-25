package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductRepository;
import entities.Product;
@Service

public class ProductServicesImp implements ProductServices {
	
	@Autowired
	ProductRepository productRepository;
	
	
	public String addProduct(Product product)
	{
		productRepository.save(product);
		return "user added";
	}
	
	public List<Product>getProducts(){return productRepository.findAll();}
	
	public Product getProductById(int id) {
		return productRepository.getOne(id);
	}
	

	public void removeProduct(int id) {
		productRepository.deleteById(id);
	}
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

}

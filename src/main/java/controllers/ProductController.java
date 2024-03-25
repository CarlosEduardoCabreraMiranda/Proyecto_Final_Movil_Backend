package controllers;

import java.util.List;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.ProductServicesImp;

@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
ProductServicesImp userServices;

	@GetMapping
	public List<Product> getproducts() {
		return userServices.getProducts();
	}
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return userServices.getProductById(id);
	}
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		userServices.addProduct(product);
		return product;
	}

	@PutMapping
	public Product updateUser(@RequestBody Product product) {
		userServices.updateProduct(product);
		return product;
	}

	@DeleteMapping("/deleteProductById/{id}")
	public Product deleteProduct (@PathVariable int id) {
		userServices.removeProduct(id);
		return new Product();
	}

}

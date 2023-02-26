package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getallproducts()
	{
		return productService.getallproducts();
	}
	
	@RequestMapping("/products/{productid}")
	public Product getoneproduct(@PathVariable("productid") String productid)
	{
		return productService.getoneproduct(productid);
	}
	@RequestMapping(method=RequestMethod.POST, value="/products")
	public void addoneproduct(@RequestBody Product product)
	{
		productService.addoneproduct(product);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/products/{productid}")
	public void putoneproduct(@RequestBody Product product,@PathVariable("productid") String productid)
	{
		productService.putoneproduct(product,productid);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{productid}")
	public void deleteoneproduct(@PathVariable("productid") String productid)
	{
		productService.deleteoneproduct(productid);
	}
	
	
}

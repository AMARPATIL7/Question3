package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getallproducts()
	{
		List<Product> p1=new ArrayList<Product>();
		productRepository.findAll().forEach(p1::add);
		return p1;
		
	}
	 
	public Product getoneproduct(String productid)
	{
		return productRepository.findByproductid(productid);
	}

	public void addoneproduct( Product product)
	{
		productRepository.save(product);
	}
	 
	public void putoneproduct( Product product,  String productid)
	{
		productRepository.save(product);
	}
	
	public void deleteoneproduct( String productid)
	{
		productRepository.deleteById(productid);
	}
}

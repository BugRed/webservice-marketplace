package com.redbug.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redbug.system.domain.Product;
import com.redbug.system.respository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> findAll(){
		return repo.findAll();
	}

}

package com.redbug.system.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redbug.system.domain.Product;
import com.redbug.system.service.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}

package com.redbug.system.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.redbug.system.domain.Product;
import com.redbug.system.respository.ProductRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		productRepository.deleteAll();
		
		
		Product treloso = new Product(null, "Treloso", 1.75, "Biscoito de chocolate");
		Product futurinhos = new Product(null, "Futurinhos", 1.50, "Biscoito de chocolate MELHOR");
		Product piraque = new Product(null, "Piraquê", 1.00, "Biscoito de chocolate PIOR");
		
		productRepository.saveAll(Arrays.asList(treloso, futurinhos, piraque));
		
		
		
		
	}
	
	
}

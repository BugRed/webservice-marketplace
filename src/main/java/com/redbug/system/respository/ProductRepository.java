package com.redbug.system.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.redbug.system.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}

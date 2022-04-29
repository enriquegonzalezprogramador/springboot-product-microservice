package com.microservicesexample.productmicroservice.repository;

import com.microservicesexample.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {



}

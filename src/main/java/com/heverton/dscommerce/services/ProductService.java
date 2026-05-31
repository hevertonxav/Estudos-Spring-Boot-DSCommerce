package com.heverton.dscommerce.services;

import com.heverton.dscommerce.dto.ProductDTO;
import com.heverton.dscommerce.entities.Product;
import com.heverton.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findByd(Long id){

        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}

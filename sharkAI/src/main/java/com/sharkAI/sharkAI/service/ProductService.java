package com.sharkAI.sharkAI.service;

import com.sharkAI.sharkAI.domain.Product;
import com.sharkAI.sharkAI.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findById(Long id){
        return productRepository.getOne(id);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

}

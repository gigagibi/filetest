package com.example.filetest.services.elastic;

import com.example.filetest.models.elastic.Product;
import com.example.filetest.repositories.elastic.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Profile("elastic")
@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    public Iterable<Product> insertBulk(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getBogdan() {
        return productRepository.findBogdan();
    }
}

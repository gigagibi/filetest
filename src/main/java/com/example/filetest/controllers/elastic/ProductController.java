package com.example.filetest.controllers.elastic;

import com.example.filetest.models.elastic.Product;
import com.example.filetest.services.elastic.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api/products/")
public class ProductController {
    private final ProductService productService;

    @GetMapping("{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id) {
        return ResponseEntity.ok().body(productService.getProduct(id));
    }

    @PutMapping
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return ResponseEntity.ok().body("Product was created");
    }

    @GetMapping("bogdan")
    public ResponseEntity<List<Product>> getBogdan() {
        return ResponseEntity.ok().body(productService.getBogdan());
    }
}

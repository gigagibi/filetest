package com.example.filetest.repositories.elastic;

import com.example.filetest.models.elastic.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findAllById(String id);

    @Query("{\"match\":{\"name\":\"bogdan\"}}")
    List<Product> findBogdan();
}

package ederfmatos.chapterspringgraphql.domain.service;

import ederfmatos.chapterspringgraphql.domain.model.request.CreateProductRequest;
import ederfmatos.chapterspringgraphql.domain.model.response.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product createProduct(CreateProductRequest createProductRequest);

}

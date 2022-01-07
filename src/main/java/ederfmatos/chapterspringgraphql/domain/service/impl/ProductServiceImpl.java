package ederfmatos.chapterspringgraphql.domain.service.impl;

import ederfmatos.chapterspringgraphql.domain.model.request.CreateProductRequest;
import ederfmatos.chapterspringgraphql.domain.model.response.Product;
import ederfmatos.chapterspringgraphql.domain.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product createProduct(CreateProductRequest request) {
        Product product = new Product(
                UUID.randomUUID().toString(),
                request.name(),
                request.category(),
                request.amount()
        );

        products.add(product);

        return product;
    }

}

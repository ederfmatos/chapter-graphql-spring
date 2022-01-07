package ederfmatos.chapterspringgraphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import ederfmatos.chapterspringgraphql.domain.model.request.CreateProductRequest;
import ederfmatos.chapterspringgraphql.domain.model.response.Product;
import ederfmatos.chapterspringgraphql.domain.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductResolver implements GraphQLMutationResolver, GraphQLQueryResolver {

    private final ProductService productService;

    public ProductResolver(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> products() {
        return productService.findAll();
    }

    public Product createProduct(CreateProductRequest createProductRequest) {
        return productService.createProduct(createProductRequest);
    }

}

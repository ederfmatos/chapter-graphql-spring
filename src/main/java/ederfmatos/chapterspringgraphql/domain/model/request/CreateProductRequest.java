package ederfmatos.chapterspringgraphql.domain.model.request;

import java.math.BigDecimal;

public record CreateProductRequest(String name, String category, BigDecimal amount) {
}

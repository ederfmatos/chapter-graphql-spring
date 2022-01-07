package ederfmatos.chapterspringgraphql.domain.model.response;

import java.math.BigDecimal;

public record Product(
        String id,
        String name,
        String category,
        BigDecimal amount
) {
}

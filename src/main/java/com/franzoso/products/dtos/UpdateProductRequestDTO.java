package com.franzoso.products.dtos;

public record UpdateProductRequestDTO(
        String description,
        Integer quantity,
        Double sellingPrice
) {
}

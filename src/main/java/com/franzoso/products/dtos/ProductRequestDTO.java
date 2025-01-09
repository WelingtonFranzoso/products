package com.franzoso.products.dtos;

import jakarta.persistence.Column;

public record ProductRequestDTO(
        String name,
        String description,
        String brand,
        String category,
        String barcode,
        Integer quantity,
        Double costPrice,
        Double sellingPrice
) {
}

package com.franzoso.products.dtos;

public record CreateProductRequestDTO(
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

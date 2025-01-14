package com.franzoso.products.dtos;

import com.franzoso.products.entities.Product;

public record SearchProductResponseDTO(
        String id,
        String name,
        String description,
        String brand,
        String category,
        String barcode,
        Integer quantity,
        Double costPrice,
        Double sellingPrice,
        Boolean active
) {

    public static SearchProductResponseDTO response(Product product) {
        return new SearchProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getBrand(),
                product.getCategory(),
                product.getBarcode(),
                product.getQuantity(),
                product.getCostPrice(),
                product.getSellingPrice(),
                product.getActive());
    }
}

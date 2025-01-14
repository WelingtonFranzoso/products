package com.franzoso.products.dtos;

import com.franzoso.products.entities.Product;

public record ListProductResponseDTO(
        String id,
        String name,
        String brand,
        String category,
        String barcode,
        Integer quantity,
        Double costPrice,
        Double sellingPrice,
        Boolean active
) {

    public static ListProductResponseDTO response(Product product) {
        return new ListProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getBrand(),
                product.getCategory(),
                product.getBarcode(),
                product.getQuantity(),
                product.getCostPrice(),
                product.getSellingPrice(),
                product.getActive());
    }
}

package com.franzoso.products.dtos;

public record ProductResponseDTO(
        String id,
        String name
) {

    public static ProductResponseDTO response(String id, String name) {
        return new ProductResponseDTO(id, name);
    }
}

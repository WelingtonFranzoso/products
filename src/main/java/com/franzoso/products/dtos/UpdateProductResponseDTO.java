package com.franzoso.products.dtos;

public record UpdateProductResponseDTO(
        String id,
        String name
) {

    public static UpdateProductResponseDTO response(String id, String name) {
        return new UpdateProductResponseDTO(id, name);
    }
}

package com.franzoso.products.dtos;

public record CreateProductResponseDTO(
        String id,
        String name,
        Boolean active
) {

    public static CreateProductResponseDTO response(String id, String name, Boolean active) {
        return new CreateProductResponseDTO(id, name, active);
    }
}

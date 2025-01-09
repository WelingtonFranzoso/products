package com.franzoso.products.services;

import com.franzoso.products.dtos.*;
import com.franzoso.products.entities.Product;
import com.franzoso.products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductResponseDTO saveProduct(ProductRequestDTO requestDTO) {
        Product newProduct = Product.newProduct(
                requestDTO.name(),
                requestDTO.description(),
                requestDTO.brand(),
                requestDTO.category(),
                requestDTO.barcode(),
                requestDTO.quantity(),
                requestDTO.costPrice(),
                requestDTO.sellingPrice()
        );
        final var createdProduct = repository.save(newProduct);
        return ProductResponseDTO.response(createdProduct.getId(), createdProduct.getName());
    }

    public UpdateProductResponseDTO updateProduct(String id, UpdateProductRequestDTO requestDTO) {
        final var product = repository.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
        product.updateProduct(
                requestDTO.description(),
                requestDTO.quantity(),
                requestDTO.sellingPrice()
        );
        final var updatedProduct = repository.save(product);
        return UpdateProductResponseDTO.response(updatedProduct.getId(), updatedProduct.getName());
    }

    public SearchProductResponseDTO findById(String id) {
        final var product = repository.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
        return SearchProductResponseDTO.response(product);
    }

    public List<ListProductResponseDTO> findAll() {
        final var product = repository.findAll();
        return product.stream().map(ListProductResponseDTO::response).toList();
    }

    public void deleteProduct(String id) {
        repository.deleteById(id);
    }
}
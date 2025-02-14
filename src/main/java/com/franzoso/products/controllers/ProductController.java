package com.franzoso.products.controllers;

import com.franzoso.products.dtos.*;
import com.franzoso.products.services.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/products")
@Tag(name = "Product", description = "Manages the products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Save new products", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Save successfully completed"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "500", description = "Error saving data")
    })
    public ResponseEntity<CreateProductResponseDTO> saveProduct(@RequestBody CreateProductRequestDTO requestDTO) {
        CreateProductResponseDTO responseDTO = service.saveProduct(requestDTO);
        return ResponseEntity.created(URI.create("/products/" + responseDTO.id())).body(responseDTO);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Update products", method = "PUT")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Update successfully completed"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Error updating data")
    })
    public ResponseEntity<UpdateProductResponseDTO> updateProduct(@PathVariable("id") String id, @RequestBody UpdateProductRequestDTO requestDTO) {
        UpdateProductResponseDTO responseDTO = service.updateProduct(id, requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Activate product by id", method = "PUT")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Activate successfully completed"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Error activating data")
    })
    public ResponseEntity<Void> activateProduct(@RequestParam String id) {
        service.activateProduct(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Search products by id", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Search successfully completed"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Error searching data")
    })
    public ResponseEntity<SearchProductResponseDTO> findById(@PathVariable("id") String id) {
        SearchProductResponseDTO responseDTO = service.findById(id);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Search all active products", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Search successfully completed"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "500", description = "Error searching data")
    })
    public ResponseEntity<List<ListProductResponseDTO>> findAllByActiveTrue() {
        List<ListProductResponseDTO> responseDTO = service.findAllByActiveTrue();
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Search all products in the database ", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Search successfully completed"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "500", description = "Error searching data")
    })
    public ResponseEntity<List<ListProductResponseDTO>> findAll() {
        List<ListProductResponseDTO> responseDTO = service.findAll();
        return ResponseEntity.ok(responseDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Deactivate product by id", method = "DELETE")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "deactivate successfully completed"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Error deactivating data")
    })
    public ResponseEntity<Void> deactivateProduct(@PathVariable("id") String id) {
        service.deactivateProduct(id);
       return ResponseEntity.noContent().build();
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete product by id", method = "DELETE")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Delete successfully completed"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Product not found"),
            @ApiResponse(responseCode = "500", description = "Error deleting data")
    })
    public ResponseEntity<Void> deleteProduct(@RequestParam String id) {
        service.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}

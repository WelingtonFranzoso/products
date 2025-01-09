package com.franzoso.products.entities;

import com.franzoso.products.util.IdUtil;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "Product")
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "id", nullable = false)
    private String id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "brand", nullable = false)
    private String brand;
    @Column(name = "category", nullable = false)
    private String category;
    @Column(name = "barcode", nullable = false, unique = true)
    private String barcode;
    @Column(name = "quantity", nullable = false)
    private Integer quantity;
    @Column(name = "cost_price", nullable = false)
    private Double costPrice;
    @Column(name = "selling_price", nullable = false)
    private Double sellingPrice;
    @Column(name = "insertion_date", nullable = false, columnDefinition = "TIMESTAMP(6)")
    private LocalDateTime insertionDate;

    public Product() {
    }

    private Product(String id, String name, String description, String brand, String category, String barcode, Integer quantity, Double costPrice, Double sellingPrice, LocalDateTime insertionDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.category = category;
        this.barcode = barcode;
        this.quantity = quantity;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.insertionDate = insertionDate;

    }

    public static Product newProduct(String name, String description, String brand, String category, String barcode, Integer quantity, Double costPrice, Double sellingPrice) {
        String id = IdUtil.uuid();
        LocalDateTime insertionDate = LocalDateTime.now();
        return new Product(id, name, description, brand, category, barcode, quantity, costPrice, sellingPrice, insertionDate);
    }

    public Product  updateProduct(String description, Integer quantity, Double sellingPrice) {
        this.description = description;
        this.quantity = quantity;
        this.sellingPrice = sellingPrice;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public String getBarcode() {
        return barcode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public LocalDateTime getInsertionDate() {
        return insertionDate;
    }
}

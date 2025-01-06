package com.example.kafka.common.Entity;

public class ProductCreatedEvent
{

    private String productId;
    private String name;
    private Integer price;
    private Integer Quantity;

    public ProductCreatedEvent() {
    }

    public ProductCreatedEvent(String productId, String name, Integer price, Integer quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        Quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
}

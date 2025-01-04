package com.example.kafka.common.Entity;

public class ProductCreatedEvent
{

    private String productId;
    private String title;
    private Integer price;
    private Integer Quantity;

    public ProductCreatedEvent() {
    }

    public ProductCreatedEvent(String productId, String title, Integer price, Integer quantity) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        Quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

package com.andrevitor103.orders.entities;

import com.andrevitor103.orders.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantity;
    private Double price;
    public OrderItem() {
    }
    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        this.id.setOrder(order);
        this.id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @JsonIgnore
    public Order getOrder() {
        return this.id.getOrder();
    }
    public void setOrder(Order order) {
        this.id.setOrder(order);
    }
    public Product getProduct() {
        return this.id.getProduct();
    }
    public void setProduct(Product product) {
        this.id.setProduct(product);
    }
}
package com.game.gameshopapp.rest.dto;

import com.game.gameshopapp.core.model.Order;

import java.util.List;

public class OrderRequestDTO {
    private String id;
    private String customerUserName;
    private String customerEmail;
    private double totalRate;
    private List<String> purchasedItems;

    public OrderRequestDTO() { }


    public OrderRequestDTO(Order order) {
        this.customerUserName = order.getCustomerUserName();
        this.customerEmail = order.getCustomerEmail();
        this.totalRate = order.getTotalRate();
        this.purchasedItems = order.getPurchasedItems();
    }

    public Order toEntity() {
        Order order = new Order();
        order.setCustomerUserName(customerUserName);
        order.setCustomerEmail(customerEmail);
        order.setPurchasedItems(purchasedItems);
        order.setTotalRate(totalRate);
        return order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public double getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(double totalRate) {
        this.totalRate = totalRate;
    }

    public List<String> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List<String> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

}

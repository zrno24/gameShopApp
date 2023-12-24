package com.game.gameshopapp.core.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Order {

    @Id
    private String id;

    private String customerUserName;

    private List<String> purchasedItems;

    private double totalRate;

    private String customerEmail;


    public Order(String id, String customerUserName, String customerEmail, double totalRate, List<String> purchasedItems) {
        this.id = id;
        this.customerEmail = customerEmail;
        this.customerUserName = customerUserName;
        this.totalRate = totalRate;
        this.purchasedItems = purchasedItems;
    }

    public Order() {

    }


    public void setOrderID(String id) {
        this.id = id;
    }

    public String getOrderID() {
        return id;
    }


    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public List<String> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List<String> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

    public double getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(double totalRate) {
        this.totalRate = totalRate;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}

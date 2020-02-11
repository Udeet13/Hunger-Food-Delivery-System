package com.example.food;

public class UpcomingModel {

    private int image;
    private String date,time,restaurant_name;
    private int quantity,amount;
    private String dish_name;
    private String order_id;
    private String delivery_boy_name;

    public UpcomingModel(int image, String date, String time, String restaurant_name, int quantity, int amount, String dish_name, String order_id, String delivery_boy_name) {
        this.image = image;
        this.date = date;
        this.time = time;
        this.restaurant_name = restaurant_name;
        this.quantity = quantity;
        this.amount = amount;
        this.dish_name = dish_name;
        this.order_id = order_id;
        this.delivery_boy_name = delivery_boy_name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getDelivery_boy_name() {
        return delivery_boy_name;
    }

    public void setDelivery_boy_name(String delivery_boy_name) {
        this.delivery_boy_name = delivery_boy_name;
    }







}

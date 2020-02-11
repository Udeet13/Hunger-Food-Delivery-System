package com.example.food.Past;

public class PastModel {


    private int image;
    private String date,time,restaurant_name;
    private int quantity,amount;
    private String dish_name;
    private String order_id;
    private String deliver_boy_name;


    public PastModel(String restaurant_name,int image,String date,String time,int quantity, int amount, String dish_name,String order_id,String deliver_boy_name) {

        this.restaurant_name = restaurant_name;
        this.image = image;
        this.date = date;
        this.time = time;
        this.quantity = quantity;
        this.amount = amount;
        this.dish_name = dish_name;
        this.order_id =order_id;
        this.deliver_boy_name = deliver_boy_name;
    }


    public String getRestaurant_name() {

        return this.restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {

        this.restaurant_name = restaurant_name;
    }

    public int getImage(){
        return this.image;
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

    public String getDeliver_boy_name() {
        return deliver_boy_name;
    }

    public void setDeliver_boy_name(String deliver_boy_name) {
        this.deliver_boy_name = deliver_boy_name;
    }
}

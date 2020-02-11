package com.example.food;

public class ScreenItem {

    String Title, Description;
    int ScreenImg;

    public ScreenItem(String title, String description, int screenImg) {
        this.Title = title;
        this.Description = description;
        this.ScreenImg = screenImg;

    }
    public void setTitle(String title) {
        this.Title = title;
    }
    public void setDescription(String description) {
        this.Description = description;
    }
    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
    public String getTitle() {
        return Title;
    }

    public String getDesciption() {
        return Description;
    }
    public int getScreenImg() {
        return ScreenImg;
    }
}

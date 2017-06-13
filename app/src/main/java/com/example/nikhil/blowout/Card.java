package com.example.nikhil.blowout;

/**
 * Created by Nikhil on 17-04-2017.
 */

public class Card {
private String imgUrl;
private String Title;

    public Card(String imgUrl, String title) {
        this.imgUrl = imgUrl;
        Title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}

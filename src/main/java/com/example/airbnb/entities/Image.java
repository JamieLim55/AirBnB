package com.example.airbnb.entities;

/**
 * Image
 */
public class Image {

    String desc;
    String url;


    public Image(String desc, String url) {
        this.desc = desc;
        this.url = url;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
package com.oose.recyclerviewdemo.app;

/**
 * Created by bubu on 10/20/14.
 */
public class MyPojo {

    String title;
    String desc;
    int image;

    public MyPojo(String title, String desc, int image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}

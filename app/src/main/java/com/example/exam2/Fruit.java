package com.example.exam2;

public class Fruit {
    private String number;
    private String name;
    private int imageId;
    private String price;

    //设置水果参数等，这样能够在每行的显示四个属性
    public Fruit(String number, String name, int imageId, String price) {
        this.number = number;
        this.name = name;
        this.imageId = imageId;
        this.price = price;

    }

    //设置对应的GET方法
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getPrice() {
        return price;
    }
}
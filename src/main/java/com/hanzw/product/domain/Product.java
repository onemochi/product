package com.hanzw.product.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {


    public  Product(){ }

    public  Product(int id, String name, int price, int store){
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    private int id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格,分为单位
     */
    private int price;

    /**
     * 库存
     */
    private int store;
}

/*
 * This file is generated by jOOQ.
 */
package com.jooq.demo.generator.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Info implements Serializable {

    private static final long serialVersionUID = 1783381339;

    private Integer id;
    private String  name;
    private Integer price;

    public Info() {}

    public Info(Info value) {
        this.id = value.id;
        this.name = value.name;
        this.price = value.price;
    }

    public Info(
        Integer id,
        String  name,
        Integer price
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Info (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(price);

        sb.append(")");
        return sb.toString();
    }
}

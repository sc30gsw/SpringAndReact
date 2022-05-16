package com.example.demo.domain.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class BirthStone implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 月 */
    private String month;

    /** 名前 */
    private String name;

    /** 色 */
    private String color;

    public BirthStone (String month, String name, String color) {
        this.month = month;
        this.name = name;
        this.color = color;
    }

}

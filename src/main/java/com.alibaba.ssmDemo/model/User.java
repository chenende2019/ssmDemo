package com.alibaba.ssmDemo.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private int sex;
    private String address;
    private int age;
}

package com.example.xiantong.myapplication;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Mr.Lee on 2017/8/8.
 */
@Table(name = "Categories")
public class Category extends Model {
    @Column(name = "Name",index  =  true)
    public String name;

    @Column(name=" Category",index  =  true)
    public  Category category;
}
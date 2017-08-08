package com.example.xiantong.myapplication;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Mr.Lee on 2017/8/8.
 */
@Table(name = "Items")
public class Item extends Model {
    @Column(name = "remote_id", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public int remoteId;
    @Column(name = "Name")
    public String name;

    @Column(name = "Category")
    public Category category;

    public Item(){
        super();
    }
    public Item(String name, Category category){
        super();
        this.name = name;
        this.category = category;
    }
}
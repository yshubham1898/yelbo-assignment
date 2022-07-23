package com.project.yelboAssignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    @Column(name = "category_code")
    public long categoryCode;

    @Column(name = "value")
    public int value;


    public Category() {

    }

    public Category(int generatedCode, int value) {
        this.categoryCode = generatedCode;
        this.value = value;
    }

    public long getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(long generatedCode) {
        this.categoryCode = generatedCode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

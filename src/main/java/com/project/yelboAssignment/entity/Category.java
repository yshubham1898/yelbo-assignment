package com.project.yelboAssignment.entity;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @Column(name = "category_code")
    public long categoryCode;

    @Column(name = "value")
    public long value = 0L;


    public Category() {

    }

    public Category(long generatedCode, long value) {
        this.categoryCode = generatedCode;
        this.value = value;
    }

    public long getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(long generatedCode) {
        this.categoryCode = generatedCode;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}

package com.project.yelboAssignment.controller;

public class ResponseEntity {

    private long prevValue;

    private long newValue;

    public ResponseEntity() {

    }

    public ResponseEntity(long prevValue, long newValue) {
        this.prevValue = prevValue;
        this.newValue = newValue;
    }

    public long getPrevValue() {
        return prevValue;
    }

    public void setPrevValue(long prevValue) {
        this.prevValue = prevValue;
    }

    public long getNewValue() {
        return newValue;
    }

    public void setNewValue(long newValue) {
        this.newValue = newValue;
    }
}

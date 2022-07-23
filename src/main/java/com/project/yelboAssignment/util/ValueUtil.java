package com.project.yelboAssignment.util;


public class ValueUtil {

    public static long getValue(long oldValue){
        long nextValue = 0L;
        if(oldValue ==0){
            nextValue = 1L;
        }else{
            nextValue = nextValue + 9L;
        }
        return nextValue;
    }

}

package com.mynotes.javacode;

public class TestClass {

    public String test(boolean input){
        return input ? "True" : "False";
    }

    public void print(int[] arr){
        for (int num : arr){
            System.out.println(num);
        }
    }
}

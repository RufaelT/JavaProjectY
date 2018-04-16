package com.gebeya.app.controllers;

public class BaseController <T> {
    private T objectType;
    public void addObject(T objectType){
        this.objectType=objectType;
    }
    public T getTObject(){
        return this.objectType;
    }
}

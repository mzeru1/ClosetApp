package com.company;

public class Closet {


    private Shirt s;
    private Jacket jacket;
    public void re(){
    this.s = new Shirt();
    this.jacket = new Jacket();
    jacket.setColor("red");
        System.out.println(jacket.getColor());


    }



}

package com.training.org;

public class OOPExample {
    private int real;
    private int imag;

    public void showValues(){
        System.out.println("REAL "+real+" Imag"+imag);
    }

    public static void main(String[] args) {
        OOPExample c1=new OOPExample();
        c1.showValues();
    }

}

package com.testServer.web;

class CalculatorPlus extends Calculator {
    public int sum(){
    	System.out.println("sum");
        System.out.println("+ sum :"+(this.left+this.right));

        return (this.left+this.right);
    }
    public int avg(){
    	System.out.println("avg");
        System.out.println("+ avg :"+(this.left+this.right)/2);

        return (this.left+this.right)/2;
    }
    
} 
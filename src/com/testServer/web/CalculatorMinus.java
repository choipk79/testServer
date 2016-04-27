package com.testServer.web;

class CalculatorMinus extends Calculator {
    public int sum(){

    	System.out.println("sum");
        System.out.println("- minus :"+(this.left-this.right));
        
        return (this.left-this.right);
    }
    public int avg(){
    	System.out.println("avg");
        System.out.println("- avg minus :"+(this.left+this.right)/2);

        return (this.left+this.right)/2;
    }
} 

package com.testServer.web;

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
    	System.out.println("setOprands");
        this.left = left;
        this.right = right;
    } 
    public abstract int sum();  
    public abstract int avg();  
    
    public String welcome(){
    	System.out.print("Welcome");
    	return "";
    }
    
    public void run(){
    	welcome();
    	System.out.println("run");
    	
        System.out.print("더하기 빼기 연산실행 : ");
        System.out.println("더하기 빼기 연산실행 결과값 : "+sum());
        
        System.out.print("평균 연산 실행 : ");
        System.out.println("평균 연산 실행 결과값: " + avg());
        
    }
}
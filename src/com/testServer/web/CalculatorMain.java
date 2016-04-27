package com.testServer.web;

public class CalculatorMain {
	static int a;
	static int b;
	
	void setInt(int aa, int bb){
		
		if(10 > aa+bb ){
			aa= aa*10;
			bb= bb*10;
		}
		
		a = aa;
		b = bb;
		
	}
	
    public static void main(String[] args) { 
    	CalculatorMain c = new CalculatorMain();
    	c.setInt(3,2);
    	
    	CalculatorPlus c1 = new CalculatorPlus();
    	CalculatorMinus c2 = new CalculatorMinus();

    	c1.setOprands(a, b);
        c1.run();
        
        c2.setOprands(a, b);
        c2.run();
        
        c.setInt(5,1);
        
        c1.setOprands(a, b);
        c1.run();
        
        c2.setOprands(a, b);
        c2.run();
    }
   
}
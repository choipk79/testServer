package com.testServer.web;
public class Member
{
	private String id;
	private int age;
	 
	public String getId()
	{
		return this.id;
	}
	public int getAge()
	{
		return this.age;
	}
	 
	public void setId(String id)
	{
	this.id=id;
	}
	
	public void setPw(int age)
	{
		if(age<0) {
		    return; //메서드 종료
		}
		this.age=age;
	}
	 
	private void one() {
	     System.out.println("one");
	}
	private void two() {
	     System.out.println("two");
	}
	public void oneTwo() {
	     one();
	     two();
	}
	public static void main(String[] args) { 
		Member m = new Member();
		m.oneTwo();
	}
}
 
package com.aypara.example;

public class A {
	private String status;
	private int x,y,h;
	public A() {
		
	}
	public A(int x,int y , int h){
		this.x=x;
		this.y=y;
		this.h=h;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String toString() {
		return ""+x+y;
	}
	
}

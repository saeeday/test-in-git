package com.aypara.example;

public class A {
	private int x,y;
	public A(int x,int y) {
		this.x=x;
		this.y=y;
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

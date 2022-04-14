package com.practice.javahw01;

public class Ex03 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a); //a 본인 이전에 올라가서 2*2=4
		System.out.println("b=" + b); //y본인 이후에 올라가서  1*2=2
		System.out.println("x=" + x);  //int ++x 올라가서 2
		System.out.println("y=" + y);  //int y++ 본인 이후로 올라가서 2
		
	}

}

package com.practice.javahw01;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		final double PI = 3.14;
		double v = ((double)4/3) * PI * r * r * r;
		
		System.out.println("구의 부피는: " + v + " 입니다.");
		
		sc.close();
	}

}

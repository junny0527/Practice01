package com.practice.javahw01;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int fh = 500;
		int a = sc.nextInt();
		System.out.print("100원 개수: ");
		int  oh = 100;
		int b = sc.nextInt();
		System.out.print("50원 개수: ");
		int ft = 50;
		int c = sc.nextInt();
		System.out.print("10원 개수: ");
		int t = 10;
		int d = sc.nextInt();
		int last = (fh*a)+(oh*b)+(ft*c)+(t*d);
		
		System.out.println("동전의 총합은 "+last+" 원 입니다. ");
		
		
		
		
		sc.close();

	}

}

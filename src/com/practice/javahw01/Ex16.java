package com.practice.javahw01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격 : ");
		double cost = sc.nextInt();
		System.out.print("받은 돈 : ");
		double money = sc.nextInt();
		double vat = cost/10;
		double change = money - cost;
		System.out.println("===========================");
		System.out.println("받은돈: " + money);
		System.out.println("상품가격: " + cost);
		System.out.println("부가세: " + vat);
		System.out.println("잔액: " + change );
		sc.close();
	}

}

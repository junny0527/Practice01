package com.practice.javahw01;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("화씨: ");
		double f = sc.nextInt();
		double c = 5.0/9.0*(80.0-32.0);
		System.out.println("화씨 "+c+" 의 섭씨온도는 "+f+" 입니다.");
		
		sc.close();

	}

}

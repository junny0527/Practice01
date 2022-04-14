package com.practice.javahw01;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = 60*60*24*365*300000L;
		System.out.println("빛이1년동안가는거리는"+a+"km 입니다.");
		
		sc.close();
	}

}

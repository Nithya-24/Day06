package com;

import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		int i, num, Sum = 0 ;
		Scanner sc = new Scanner (System.in);	
		System.out.println("Please Enter any Number: ");
		num = sc.nextInt();
		sc.close();
		
		for(i = 1 ; i < num ; i++) {
			if(num % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == num) {
			System.out.println(+ num + " is a Perfect Number");
		}
		else {
			System.out.println(+ num + " is a not a Perfect Number");
		}
	}
}
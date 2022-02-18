package com;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, reverse = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println ( "Enter a Number to reverse:" );
		num = sc.nextInt();
		sc.close();
		
		while ( num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println ( "The reverse of a Number is: " + reverse);

	}

}

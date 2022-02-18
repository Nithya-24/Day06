package com;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		int num, i, count=0;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = sc.nextInt();
	      sc.close();
	      for(i=2; i < num; i++) {
	         if(num % i == 0) {
	            count++;
	           
	         }
	      }
	      
	      if(count==0)
	         System.out.println( + num + " is a Prime Number.");
	      else
	         System.out.println(+ num + " is not a Prime Number.");
	   }
	}
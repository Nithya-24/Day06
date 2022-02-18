package com;

import java.util.*;

public class Fibbanacci {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3; 
		System.out.println( " Enter the counter Number: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		
		System.out.println( " Fibannoci Series upto : " +count + " terms");
		for (int i = 1; i <= count; ++i) { 
			
			System.out.print(n1 + "  ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
					
		}
		
		

	}

}

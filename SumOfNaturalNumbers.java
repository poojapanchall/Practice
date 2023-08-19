package com.kn.sumofnatural;

import java.util.Scanner;
//Java program to calculate sum of n natural numbers
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=scan.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++)
		{
			sum=sum+i;
				
		}
		System.out.println("The sum of "+num+" natural numbers is "+sum);
		scan.close();
			}

		}

	

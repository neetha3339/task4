package com.epam.task4;
import java.util.Scanner;
public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static float principle,rate,time,SimpleInterest,CompoundInterest;
	public static void main(String args[]) {
		System.out.println("Enter principle amount");
		principle = sc.nextFloat();
		System.out.println("Enter time period");
		time = sc.nextFloat();
		System.out.println("Enter rate of interest");
		rate = sc.nextFloat();
		CalculateIntrest ci =new CalculateIntrest();
		SimpleInterest=ci.CalculateSimpleInterest(principle,time,rate);
		CompoundInterest=ci.CalculateCompoundInterst(principle,time,rate);
		System.out.println("Your Simple Interest is "+SimpleInterest);
		System.out.println("Your Compound Interest is "+CompoundInterest);
	}
}

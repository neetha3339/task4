package com.epam.task4;

public class CalculateIntrest {
	public float CalculateSimpleInterest(float principle,float time,float rate) {
		float Simple_Interest=(principle*time*rate)/100;
		return Simple_Interest;
	}
	public float CalculateCompoundInterst(float principle,float time,float rate) {
		float CompoundInterest=(float)(principle*(Math.pow((1+rate/100),time)));
		return CompoundInterest;
	}
		
}

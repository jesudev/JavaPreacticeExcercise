package com.simplilearn.typecasting;

public class FirstTypeDemo {
	public static void main(String [] args) {
		// single line
		// Widening/Automatic/Implicit Type Casting
		//datatype identifier = value;
		//B->S>I>L>F>D
		byte  countByte=127;
		int icount =100;
		long lcountBig = icount;
		float fcountFp  = lcountBig;
		double dcountDecimal = fcountFp;
		double bytetoDouble = countByte;
	//int doubleToInt=bytetoDouble;
		System.out.println("Int value :"+icount);
		System.out.println("Long value"+lcountBig);
		System.out.println("Float value"+fcountFp);
		System.out.println("Double value"+dcountDecimal);
		
		
	}

}

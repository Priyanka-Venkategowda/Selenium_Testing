package com.example;

import org.testng.annotations.Test;

public class Exception {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void arithmeticException(){
		int x=10/0;
		System.out.println(x);
	}

	@SuppressWarnings("null")
	@Test(expectedExceptions=NullPointerException.class)
	public void NullPointerException() {
		String value= null;
		System.out.println(value.toString());
		}
	
	@Test(expectedExceptions=StringIndexOutOfBoundsException.class)
	public void testStringIndexOut() {
		String name="Priyanka";
		 System.out.println(name.charAt(10));
		}
	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void testArrayIndexOutOfBound(){
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(array[16]);
	}
	
//	@Test(expectedExceptions = IllegalArgumentException.class)
//    public void illegalArgumentException() {
//		int x=0, y=0;
//		int division=x/y;
//		assertEquals(0, division);
//    }
}

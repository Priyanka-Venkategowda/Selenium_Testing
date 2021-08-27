package com.example;

import org.testng.annotations.Test;

public class Ignore {

	@Test(enabled=false)
	public void Sample4(){
		System.out.println("Fourth Test Method");
		}
	
	@Test
	public void Sample5(){
		System.out.println("Fifth Test Method");
		}
	
	@Test
	public void Sample6(){
		System.out.println("Sixth Test Method");
		}
}

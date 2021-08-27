package com.example;

import org.testng.annotations.Test;

public class DependsOn {
  
	@Test
	public void Sample4(){
		System.out.println("Fourth Test Method");
		}
	
	@Test(dependsOnMethods={"Sample6"})
	public void Sample5(){
		System.out.println("Fifth Test Method");
		}
	
	@Test
	public void Sample6(){
		System.out.println("Sixth Test Method");
		}
	
	@Test
	public void Sample7(){
		System.out.println("Seventh Test Method");
		}
}

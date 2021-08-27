package com.example;

import org.testng.annotations.Test;

public class Timeout {
	
	@Test(timeOut=4000)
	public void synchronize() throws InterruptedException{
		Thread.sleep(2000);
	}

}

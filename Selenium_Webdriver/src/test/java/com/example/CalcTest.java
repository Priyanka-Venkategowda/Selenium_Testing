package com.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTest {
	Calc calc=new Calc();

  @Test(dataProvider="dpadd")
  public void add(int exp, int a, int b) {
	  Assert.assertEquals(exp,calc.add(a,b));
    
  }

  @Test
  public void sub() {
	  Assert.assertEquals(0,calc.sub(5, 5));
    
  }

  @Test(dataProvider="selenium1")
  public void contatenateString(String exp,String a, String b) {
        Assert.assertEquals(exp,calc.string(a, b));      

  }
  
  @Test(dataProvider="Selenium2")
  public void stringlength(int exp,String a, String b) {
        Assert.assertEquals(exp,calc.string1(a, b));      
        
  }
  
  @DataProvider(name="selenium1")
  public Object[][] concatenate(){
      Object[][] table_values=new Object[][] {
          {"PriyaPriya","Priya","Priya"}};
          return table_values;     
          
}
  @DataProvider(name="Selenium2")
  public Object[][] getlength(){
      Object[][] String_values=new Object[][] {
          {10,"Priya","Priya"}};
          return String_values;
  }
            
  @DataProvider(name="dpadd")
	  public Object[][] getdata(){
		  Object[][] table_values=new Object[][]{
			  {10,5,5},{20,15,5},{2,1,1}};
			  return table_values;
  			}
}
 
  


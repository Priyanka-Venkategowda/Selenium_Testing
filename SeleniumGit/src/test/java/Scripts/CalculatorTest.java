package Scripts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc=new Calculator();
	
	
	@BeforeClass
	public static void SetupBeforeClass() throws Exception{
	System.out.println("Print before Class");
	}

	@AfterClass
	public static void SetupAfterClass() throws Exception{
	System.out.println("Print after Class");
	}
	
	@Before
	public void before(){
		System.out.println("Print before Method");
	}
	
	@After
	public void after(){
		System.out.println("Print after Method");
	}
	
	@Test
	public void testSub() {
		assertEquals(0, calc.sub(5, 5));
		//assertNotEquals(1, calc.sub(5, 5));
		//assertFalse(calc.sub(5, 5)==1);
		//assertTrue(calc.sub(5, 5)==0);
		//assertSame(0, calc.sub(5, 5)); 
		//assertNotSame(1, calc.sub(5, 5));
		//assertNotNull(calc.sub(5,5));
		}

	@Test
	public void testMul() {
		assertNotEquals(1, calc.mul(5, 5));
		
	}

	@Test
	public void testAdd() {
		assertFalse(calc.add(5, 5)==20);			
	}
	
	
	@Test
	public void testDiv() {
		assertTrue(calc.div(5, 5)==1);		
	}	
	
	@Test
	public void testMod() {
		assertSame(0, calc.mod(5, 5)); 
		//assertNotSame(2, calc.mod(5, 5)); 	
	}
	
	@Ignore
	@Test
	public void testArrayCheck(){
		assertArrayEquals(new int[]{1,2,3}, calc.array(new int[]{3,4,5}, new int[]{1,2,3}));
		}
}


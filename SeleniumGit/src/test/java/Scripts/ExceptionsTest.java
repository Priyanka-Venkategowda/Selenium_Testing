package Scripts;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionsTest {
	
	Exceptions exc=new Exceptions();


	@Test(expected=ArithmeticException.class)
	public void testArithmeticException() {
//		try {
		exc.arithmetic(5,0);
//		}
//		catch(ArithmeticException e){
//			System.out.println("division by zero is infinity");
		}	
	
	@Test(expected=NullPointerException.class)
	public void testNullPointerException() {
		exc.nullpointer(  null);
		}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testStringIndexOut() {
		exc.stringindexout("Priyanka");
		}
	
//	@Test//(expected=FileNotFoundException.class)   // check ??
//	public void testFileNotFound() {
//		try {
//			FileReader f=new FileReader(exc.filenotfound("E://file.txt"));
//			} catch (FileNotFoundException e) {
//			}
//		}
	@Test(expected=NumberFormatException.class)
	public void testNumberFormat(){
		exc.numberformat("Priyanka");
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testArrayIndexOutOfBound(){
		exc.arrayindexout(new int[]{1,2,3,4,5,6,7,8});
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
		assertEquals(0, exc.division(0, 0));
    }
}


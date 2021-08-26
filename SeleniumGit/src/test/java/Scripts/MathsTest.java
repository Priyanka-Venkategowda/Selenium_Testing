package Scripts;


import static org.junit.Assert.*;

//import java.util.concurrent.TimeoutException;

//import org.junit.Ignore;
import org.junit.Test;

//@Ignore
public class MathsTest {
	
	Maths math=new Maths();
	
	@Test
	public void testSum() {
		assertEquals(6, math.sum(1, 2, 3) );
	}

	@Test
	public void testFruitsLength(){
		assertEquals(4, math.fruits(new String[]{"Apple", "Banana", "Mango", "Gauva"} ));
	}
	
	
//	@Test(timeout=1000)
//	public void testSynchronize() throws TestTimedOutException{
//		math.synchronize(2, 1);
//	
//}
	//@Test(expected=TestTimedOutException.class)
//	@Test(timeout = 1000)
//	public void testPrintMessage() throws TestTimedOutException {
//		System.out.println("Inside testPrintMessage()");     
//		math.printMessage("Robert");
//	}
	
//	@Test(timeout=10000)
//		public void test(){
//			int i;
//			i=1;
//			while(i==1){
//				System.out.println(i);
//			}
//		}
	
	@Test(timeout=20000)
    public void test() {
        int i=3 ;
        int j=5;
        int k ;
        k=i+j;
        if(k==8) {
        System.out.println(k);
    }
}
}

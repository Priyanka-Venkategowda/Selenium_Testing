package Scripts;
		
public class Calculator {
	public int sub(int a, int b){
		return a-b;
	}
	public int mul(int a, int b){
		return a*b;
	}
	public int add(int a, int b){
		return a+b;
	}
	public int div(int a, int b){
		return a/b;	
	}
	public int mod(int a, int b){
		return a%b;
	}
	public int[] array(int[] a, int[] b){
		if (a.length>b.length)
			return a;
		else
			return b;
	
	}
}
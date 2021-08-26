package Scripts;

import java.io.File;


public class Exceptions {

	public int arithmetic(int a, int b){
		return a/b;
		}
	
	public char nullpointer(String x){
		return x.charAt(0);
		}
	
	public char stringindexout(String x){
		return x.charAt(25);
		}
	
	public File filenotfound(String x) {
		File file=new File(x);
		return file;
		}
	
	public int numberformat(String x){
		int m=Integer.parseInt(x);
		return m;
	}
	
	public int arrayindexout(int[] x){
		return x[10];
	}
	
	public int division(int a, int b){
		return a/b;
	}
	
}

class ArithmaticTest{
	public void division(int n1, int n2) 
                             throws ArithmeticException{
		System.out.println(n1/n2);
	}
 
	public void method1(int n1, int n2) throws Exception{
		division(n1, n2);
	}
 
	public void method2(int n1, int n2){
		try{
			method1(n1, n2);
		}catch(Exception e){
			System.out.println("Exception Handled");
		}
	}
}
 
public class ExceptionThrowsExample {
	public static void main(String args[]){
		
		ArithmaticTest obj =  new ArithmaticTest();
                                      obj.method2(10,0);
	}
}
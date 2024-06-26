package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			//int data= 100/0;
			String s = null;
			System.out.println(s.length());
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Rest of the code");

	}

}

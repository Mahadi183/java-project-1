package exception;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
//			int a[] = new int[5];
//			System.out.println(a[10]);
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occur");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception occur");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occur");
		}
		
		System.out.println("rest of the code");

	}

}

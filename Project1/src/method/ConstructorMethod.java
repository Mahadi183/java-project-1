package method;

public class ConstructorMethod {
	
	public int num1,num2;
	
	
	
	ConstructorMethod(int a, int b){
		System.out.println("Constructor called");
		num1=a;
		num2=b;
		 
		}

	public static void main(String[] args) {
		
		ConstructorMethod obj = new ConstructorMethod(30,15);
		System.out.println("Sum is:"+ (obj.num1+obj.num2));
		
		

	}

}

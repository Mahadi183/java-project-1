package method;

public class Method {
	
	Method(){
		
	}
	
	int sum(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Method obj = new Method();
		System.out.println(obj.sum(10, 15));
		// TODO Auto-generated method stub

	}

}

package array1;
public class BasicArray {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		int num2[] = {10,20,30,67,87,90};
		int sum=0;
		String name[] = {"Nazim","Masha","Jayanti","Fathema","Sultana","Lipi","Lohita"};
		
		for(int i=0;i<num2.length;i++) {
			sum = sum+num2[i];
			
			
		}
		System.out.println(sum);
	}

}

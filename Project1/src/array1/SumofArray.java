package array1;

public class SumofArray {

	public static void main(String[] args) {
		int array[] = {27,38,16,25,10};
		int sum =0;
		double avg ;
		for(int i=0; i<array.length;i++) {
			sum=sum+array[i];
			
		}
		
		avg=sum/array.length;
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+avg);

	}

}

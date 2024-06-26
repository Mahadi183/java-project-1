package array1;

public class MaxArray {

	public static void main(String[] args) {
		int array[] = {20,30,10,57,2,95};
		int min = array[0];
		for(int i=1; i<array.length;i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Minimum value from an array is: "+min);

	}

}

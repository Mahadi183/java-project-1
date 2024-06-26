package array1;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[] = {27,38,15,3,56};
		for(int i=0; i< arr.length;i++) {
			if(arr[i] %2 == 0) {
				System.out.println(arr[i]+" is a even number");
			}
			else {
				System.out.println(arr[i]+" is a odd number");
			}
		}

	}

}

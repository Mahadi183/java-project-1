package array;
import java.util.*;
public class Series {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter value for Addition: ");
		int n = obj.nextInt();
		int s=0;
		for(int i=1;i<=n;i++) {
			s=s+i*i;
			System.out.println("S = "+s);
		}
		
		System.out.println("Total Addition Value: "+s);

	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReading {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		/*
		 * arr.add(10); arr.add(11); arr.add(12); arr.add(13);
		 */
		System.out.println("Enter any Number");

		Scanner sc = new Scanner(System.in);

		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		Integer num3 = sc.nextInt();
		Integer num4 = sc.nextInt();
		Integer num5 = sc.nextInt();
		arr.add(num1);
		arr.add(num2);
		arr.add(num3);
		arr.add(num4);
		arr.add(num5);
		
		
		for (int i=0;i<arr.size();i++) {
			
			System.out.println(arr.get(i));
		}
		
		

		/*
		 * for (int k = 0; k <= arr.size() - 1; k++) {
		 * 
		 * if (arr.get(k) % 2 == 0) {
		 * 
		 * System.out.println("Even Number" + "------>" + arr.get(k));
		 * 
		 * } }
		 */

	}

}

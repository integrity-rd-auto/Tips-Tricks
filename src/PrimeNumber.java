import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();

		if (number <= 1) {

			return false;

		}
		for (int i = 2; number > i; i++) {
			if (number % i == 0) {
			return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isPrime());

	}

}

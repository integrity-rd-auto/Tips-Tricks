import java.util.Scanner;

public class ReverseString {

	public static String reverse(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		}
		String reverse = "";
		for (int i = source.length() - 1; i >= 0; i--) {
			reverse = reverse + source.charAt(i);
		}

		return reverse;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		ReverseString.reverse(input);

	}

}

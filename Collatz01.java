public class Collatz01 {
	public static void main(String[] args) {
		System.out.println(getCollatzSequence(5));
	}

	public static String getCollatzSequence(int number) {
		String result = number + " ";
		int count = 0;

		if (number <= 0)
			return "Error";

		while (number >= 1) {
			count++;
			if (number % 2 == 0)
				number = number / 2;
			else
				number = number * 3 + 1;

			result += number + " ";

			if (result.contains("4 2 1"))
				break;

			if (count >= 97 && number != 8)
				return "Does not Converge";

		}

		return result.trim();
	}
}

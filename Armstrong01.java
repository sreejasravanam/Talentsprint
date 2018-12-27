public class Armstrong01 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 1999;
		System.out.println(generateArmstrongNums(num1, num2));
	}

	public static String generateArmstrongNums(int start, int limit) {
		String result = "";

		if (start <= 0 || limit <= 0)
			return "-1";

		if (start >= limit)
			return "-2";

		for (int i = start; i <= limit; i++) {
			if (isArmstrong(i)) {
				result += i + ",";
			}
		}

		if (result.length() == 0)
			return "-3";

		result = result.substring(0, result.length() - 1);
		return result;

	}

	public static boolean isArmstrong(int num) {

		if (num == sumOfPowersOfDigits(num))
			return true;
		else
			return false;

	}

	public static int sumOfPowersOfDigits(int n) {
		int digits[] = getDigits(n);
		int sum = 0;

		for (int d : digits)
			sum += power(d, digits.length);
		return sum;
	}

	public static int[] getDigits(int n) {
		int count = 0, t, rem;
		t = n;

		while (t > 0) {
			rem = t % 10;
			count++;
			t = t / 10;
		}

		int digits[] = new int[count];
		int i = 0;

		while (n > 0) {
			digits[i] = n % 10;
			i++;
			n = n / 10;

		}

		return digits;
	}

	public static int power(int d, int p) {
		int power = 1;

		for (int k = 1; k <= p; k++) {
			power *= d;

		}
		return power;
	}
}

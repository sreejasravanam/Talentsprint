public class NextHundred01 {
	public static void main(String[] args) {
		// Add your code here
		int n;
		n = -1;
		System.out.println(getNextMultipleOf100(n));
		n = 200;
		System.out.println(getNextMultipleOf100(n));
	}

	public static int getNextMultipleOf100(int num) {
		int r = 0;
		if (num <= 0)
			r = -1;

		if (num > 0)
			r = (num / 100 + 1) * 100;
		return r;
		// Add your code here
	}
}
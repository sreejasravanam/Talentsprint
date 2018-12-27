public class Fibonacci01 {
	public static void main(String[] args) {
		System.out.println(getFibonacciSeries(7));
	}

	public static String getFibonacciSeries(int num) {
		String fib = "";
		int sum = 0, n1 = 0, n2 = 1;
		fib=n1+","+n2;
		if (num < 1 || num > 40)
			return "-1";
		if(num==1)
			return "0";
		if(num==2)
			return "0,1";
		for(int i=0;i<num-2;i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			fib = fib + "," + sum;
			
		}

		return fib.trim();
	}
}

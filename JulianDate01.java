public class JulianDate01 {
	public static void main(String[] args) {
		String date = "30-dec-2016";
		System.out.println(dateFormat(date));
	}

	public static String dateFormat(String date) {
		String[] df = date.split("-");
		int day = Integer.parseInt(df[0]);
		int mon = convertMMMtoMM(df[1]);
		int yyyy = Integer.parseInt(df[2]);

		return yyyy + julianDate(day, mon);

	}

	public static String julianDate(int dd, int mon) {
		int months[] = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
		int jd = months[mon - 1] + dd;
		String day = "" + jd;

		if (jd <= 9)
			day = "00" + jd;
		else if (jd <= 99)
			day = "0" + jd;

		return day;

	}

	public static int convertMMMtoMM(String mon) {
		String months = "janfebmaraprmayjunjlyaugsepoctnovdec";
		mon = mon.substring(0, 3);
		mon = mon.toLowerCase();
		// System.out.println((months.indexOf(mon)/3)+1);
		return ((months.indexOf(mon) / 3) + 1);
	}
}

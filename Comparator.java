public class Comparator {

	public int getMax(int n, int m) {
		double a = (double)n;
		double b = (double)m;
		return (int)getMax(a, b);
	}

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

	public String getMax(String number1, String number2) {
		Double max = getMax(Double.parseDouble(number1), Double.parseDouble(number2));
		return max.toString();
	}
}
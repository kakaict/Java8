package drive;

/*
 * Interface with extension methods
 */

public interface Calculate {
	
	public int add(int a, int b);
	
	public int sub(int a, int b);
	
	public default double sqrt(int a) {
		return Math.sqrt(a);
	}
	
	public static double getCircleArea(double r) {
		return r * r * Math.PI;
	}
	
	public static double getRectangleArea(double a, double b) {
		return a * b;
	}

}

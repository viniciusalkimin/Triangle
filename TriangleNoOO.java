import java.util.Locale;
import java.util.Scanner;

public class TriangleNoOO {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the measures of triangle X:");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();

		double px = (xa + xb + xc) / 2.0;
		double areax = Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));

		double py = (ya + yb + yc) / 2.0;
		double areay = Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));

		System.out.println("Triangle X area:" + areax);
		System.out.println("Triangle Y area:" + areay);

		if (areax > areay) {
			System.out.println("Larger area : X");
		} else {
			System.out.println("Larger area : Y");
		}
		sc.close();
	}

}

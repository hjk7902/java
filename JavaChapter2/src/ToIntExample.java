
public class ToIntExample {

	public static void main(String[] args) {
		double a=-3.6, b=-3.4, c=3.4, d=3.6;
		System.out.printf("%d %d %d %d\n", 
				Math.round(a), Math.round(b), Math.round(c), Math.round(d));
		System.out.printf("%.0f %.0f %.0f %.0f\n", 
				Math.ceil(a), Math.ceil(b), Math.ceil(c), Math.ceil(d));
		System.out.printf("%.0f %.0f %.0f %.0f\n", 
				Math.floor(a), Math.floor(b), Math.floor(c), Math.floor(d));
		System.out.printf("%d %d %d %d", (int)a, (int)b, (int)c, (int)d);
		
	}

}

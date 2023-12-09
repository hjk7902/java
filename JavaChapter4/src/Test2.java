
public class Test2 {
	public static void main(String[] args) {
		String out = "";
		a:
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 2; y++) {
				if(x==1) break;
				if(x==2 && y==1) break a;
				out = out + x + y;
			}
		}
		System.out.println(out);
	}
}
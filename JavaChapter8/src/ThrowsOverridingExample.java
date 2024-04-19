import java.io.IOException;
import java.util.Random;

public class ThrowsOverridingExample {

	public static void main(String[] args) {
		Super[] works = new Super[2];
		works[0] = new Super();
		works[1] = new Sub();

		Random rand = new Random();
		int data = rand.nextInt(200);
		for(Super s : works) {
			try {
				s.doIt(data);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}//end main
}//end class
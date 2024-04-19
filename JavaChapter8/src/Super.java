import java.io.IOException;

public class Super {
	FileSystem fs = new FileSystem();
	
	public void doIt(int num) throws IOException {
		System.out.println("Super.doIt");
		fs.save(num);
	}
}
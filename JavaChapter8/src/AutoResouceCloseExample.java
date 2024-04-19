import java.io.FileInputStream;
import java.io.IOException;

public class AutoResouceCloseExample {
	public static void main(String[] args) {
		try(FileInputStream in = new FileInputStream("a.txt")) {
			System.out.println("read data : " + in.read());
		}catch(IOException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}
	}
}
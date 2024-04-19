import java.io.IOException;
import java.sql.SQLException;

public class Sub extends Super {
	Database db = new Database();

	public void doIt(int num) throws IOException {
		System.out.println("Sub.doIt");
		try {
			db.insert(num);
		} catch (SQLException e) {
			throw new IOException(e.getMessage());
		}
	}
}
import java.sql.SQLException;

public class Database {
	public void insert(int num) throws SQLException {
		if(num>100) {
			throw new SQLException("num이 너무 큽니다.");
		}
		System.out.println("데이터베이스에 저장되었습니다.");
	}
}
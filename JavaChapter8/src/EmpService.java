import java.sql.SQLException;

public class EmpService implements IEmpService {

	@Override
	public void insert(EmpVO vo) {
		try {
			if(vo==null) {
				throw new SQLException("객체가 널입니다.");
			}// if 블록을 수정하지 않고 예외 처리를 해야 함.
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
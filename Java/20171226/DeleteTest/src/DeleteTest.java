import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	
	public int delete(int age) {
		String sql = "DELETE USERDTO "
				+" WHERE AGE < " + age;
		
		Connection conn = DBConnection.makeConnection();
		Statement stmt = null;
		
		int count = 0;
		
		System.out.println("sql:" +sql);
		
		try {
			stmt = conn.createStatement();
			
			count = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, null);
		}
		
		return count;
	}
}

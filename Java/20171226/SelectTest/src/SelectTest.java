import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {
	
	
	//하나의 데이터
	public Dto search(String id) {
		
		String sql = "SELECT ID, NAME, AGE, JOINDATE "
				+" FROM USERDTO "
				+" WHERE ID = '" + id +"'";
		
		Connection conn = DBConnection.makeConnection();
		
		PreparedStatement stmt =null;
		
		ResultSet rs = null;
		Dto dto = null;
		
		System.out.println("sql ="+sql);
		
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				 dto = new Dto();
				
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setJoindate(rs.getString("joindate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}
		return dto;
		
		
		
	}
	
	//모든 데이터
	public List<Dto> addData() {

		Connection conn = DBConnection.makeConnection();
		Statement stmt =null;
		ResultSet rs = null;
		
		List<Dto> list = new ArrayList<Dto>();

		String sql = "SELECT ID, NAME, AGE, JOINDATE "
				+" FROM USERDTO ";
		
		
		System.out.println("sql ="+sql);

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String joindate = rs.getString("joindate");
				
				Dto dto = new Dto(id, name, age, joindate);

				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
		
	}
}

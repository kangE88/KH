package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.CustUserBean;


//javabean
public class CustUserManager {

	public CustUserManager() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<CustUserBean> getcustUserList(){
		
		String sql = " SELECT ID, NAME, ADDRESS "
				+" FROM CUSTUSER "
				+" ORDER BY ID DESC ";
		
		List<CustUserBean> list = new ArrayList<CustUserBean>();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				CustUserBean cust = new CustUserBean();
				cust.setId(rs.getString("ID"));
				cust.setName(rs.getString("NAME"));
				cust.setAddress(rs.getString("ADDRESS"));
				
				list.add(cust);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, psmt, rs);
		}
			
		return list;
		
	}
	
	public CustUserBean getcustUserDetail(String id){
		
		String sql = " SELECT * FROM CUSTUSER "
				+" WHERE ID= '"+id+"'";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		CustUserBean custbean = new CustUserBean();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {	
				
				custbean.setId(rs.getString("ID"));
				custbean.setName(rs.getString("NAME"));
				custbean.setAddress(rs.getString("ADDRESS"));	
				
				//custlist.add(custbean);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, psmt, rs);
		}
			
		return custbean;
		
	}
	
	
	public boolean deleteCustUser(String[] ids) {
		String sql = " DELETE FROM CUSTUSER "
				+" WHERE ID=? ";
		
		List<CustUserBean> list = new ArrayList<CustUserBean>();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count[] = new int[ids.length];
		
		try {
			conn = getConnection();
			conn.setAutoCommit(false); //자동커밋 off
			
			psmt = conn.prepareStatement(sql);
			
			//psmt addBatch 배열 다중 처리
			for(int i=0; i<ids.length;i++) {
				psmt.setString(1, ids[i].trim());
				psmt.addBatch();
			}
			
			count = psmt.executeBatch(); //execudeUpdate 단일 처리
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		} finally {
				try {
					conn.setAutoCommit(true);
				}catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
				close(conn, psmt, null);
			}
			
		boolean isS = true;
		
		for(int i=0;i<count.length;i++) {
			System.out.println("count["+i+"] = "+count[i]);
			if(count[i] != -2) { // -2 값이 정상처리
				isS = false;
				break;
			}
		}
		return isS;
	}
	
	public int addlist(CustUserBean list) {
		/*
		  String sql = " INSERT INTO CUSTUSER (ID, NAME, ADDRESS) "
				+"  VALUES ('"+list.getId()+"', '"+list.getName()+"', '"+list.getAddress()+"') ";
		*/
		
		String sql =" INSERT INTO CUSTUSER (ID, NAME, ADDRESS) "
				+" VALUES(?, ?, ?) ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, list.getId().trim());
			psmt.setString(2, list.getName().trim());
			psmt.setString(3, list.getAddress().trim());
			
			count = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, psmt, null);
		}
			
		return count;
	}
	
public int updateCustUser(CustUserBean list) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		String sql = " UPDATE CUSTUSER "
				+" SET NAME = '" + list.getName() + "', ADDRESS = '"+ list.getAddress() +"'"
				+" WHERE ID= '"+ list.getId() +"' ";
		int count = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);
			count = psmt.executeUpdate();			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			close(conn, psmt, null);			
		}
		return count;
	}
	
	
	
	//DB접속 및 연결 해제 관련 함수
	public Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		return conn;
	}
	
	public void close(Connection conn, PreparedStatement psmt, ResultSet rs) {
		try {
			if(rs != null)
				rs.close();
			if(psmt != null) 
				psmt.close();
			if(conn != null) 
				conn.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}

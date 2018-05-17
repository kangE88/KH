package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import DB.DBClose;
import DB.DBConnection;
import DTO.MemberDTO;
import DTO.bbsDTO;

public class MemberDao {
	
	private static MemberDao dao = null;
	int ck_id = 0;
	
	public static MemberDao getinstance() {
		if(dao == null) {
			dao = new MemberDao();
		}
		return dao;
	}
	
	public int getId(String id) {
		

		//ID 중복체크
		String sql = "SELECT ID FROM MEMBER "
				+" WHERE ID ='"+id+"' ";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				ck_id = 2;
			}else {
				ck_id = 1;
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}
		return ck_id;
	
	}
	
	public boolean getId(String id, String pwd) {
		String sql = "SELECT ID FROM MEMBER "
				+" WHERE ID =? AND PWD= ?";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pwd);
			
			rs = stmt.executeQuery();
			return rs.next();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
			
		}
		return false;
		
	}
	
	//회원정보 insert
	public int Insert(MemberDTO dto) {
		
		System.out.println(dto.toString());
		
		String sql = "INSERT INTO MEMBER(ID, PWD, NAME, EMAIL, AUTH)"
				+" VALUES(?,?,?,?,3)";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, dto.getId());
			stmt.setString(2, dto.getPwd());
			stmt.setString(3, dto.getName());
			stmt.setString(4, dto.getEmail());
			
			rs = stmt.executeQuery();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}		
		
		
		return ck_id;
	}

	
	//USER정보 가져가기
	public MemberDTO User(String id) {
		
		String pwd;
		String name;
		String email;
		int auth;
		
		MemberDTO dto = new MemberDTO();
		
		String sql = "SELECT * FROM MEMBER WHERE ID =?";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				id = rs.getString("ID");
				pwd = rs.getString("PWD");
				name = rs.getString("NAME");
				email = rs.getString("EMAIL");
				auth =rs.getInt("AUTH");
				
				dto.setId(id);
				dto.setPwd(pwd);
				dto.setName(name);
				dto.setEmail(email);
				dto.setAuth(auth);
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}
		
		return dto;
	}
	
	//BBS TABLE 정보 가져가기
	public Vector getBBSDTO() {
		
		Vector data = new Vector();  //Jtable에 값을 쉽게 넣는 방법 1. 2차원배열   2. Vector 에 vector추가
		
		String sql = "SELECT * FROM BBS";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				int seq = rs.getInt("SEQ");
				String id = rs.getString("ID");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				String wdate = rs.getString("WDATE");
				int del = rs.getInt("DEL");
				int readcount = rs.getInt("READCOUNT");

				Vector row = new Vector();
				row.add(seq);
				row.add(id);
				row.add(title);
				row.add(content);
				row.add(wdate);
				row.add(readcount);
				
				data.add(row);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}
	
		return data;
		
	}
	
	//seach bbsdto
	public Vector searchBBSDTO(String title, String id) {
		
		Vector data = new Vector();  //Jtable에 값을 쉽게 넣는 방법 1. 2차원배열   2. Vector 에 vector추가
		
		String sql = "SELECT * FROM BBS WHERE TITLE LIKE '%' || ? || '%' AND ID= ?";
		
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, title);
			stmt.setString(2, id);
			
			rs = stmt.executeQuery();

			while(rs.next()) {
				
				int seq = rs.getInt("SEQ");
				id = rs.getString("ID");
				title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				String wdate = rs.getString("WDATE");
				int del = rs.getInt("DEL");
				int readcount = rs.getInt("READCOUNT");

				Vector row = new Vector();
				row.add(seq);
				row.add(id);
				row.add(title);
				row.add(content);
				row.add(wdate);
				row.add(readcount);
				
				data.add(row);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}
	
		return data;
		
	}
	
	//USER ID로 테이블 등록정보 가져가기
	public bbsDTO editTable(String id, int seq) {
		
		bbsDTO bbsdto = new bbsDTO();
		
		String sql = "SELECT * FROM BBS WHERE SEQ =? AND ID= ?";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, seq);
			stmt.setString(2, id);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				seq = rs.getInt("SEQ");
				id = rs.getString("ID");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				String wdate =rs.getString("WDATE");
				int del = rs.getInt("DEL");
				int readCount = rs.getInt("READCOUNT");
				
				bbsdto.setSeq(seq);
				bbsdto.setId(id);
				bbsdto.setTitle(title);
				bbsdto.setContent(content);
				bbsdto.setWdate(wdate);
				bbsdto.setDel(del);
				bbsdto.setReadcount(readCount);

			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}
		
		return bbsdto;
	}
	
	//Search
	public bbsDTO searchTable(String content, String id) {
		
		bbsDTO bbsdto = new bbsDTO();
		
		String sql = "SELECT Content FROM BBS WHERE CONTENT LIKE '%' || ? || '%' AND ID= ?";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, content);
			stmt.setString(2, id);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int seq = rs.getInt("SEQ");
				id = rs.getString("ID");
				String title = rs.getString("TITLE");
				content = rs.getString("CONTENT");
				String wdate =rs.getString("WDATE");
				int del = rs.getInt("DEL");
				int readCount = rs.getInt("READCOUNT");
				
				bbsdto.setSeq(seq);
				bbsdto.setId(id);
				bbsdto.setTitle(title);
				bbsdto.setContent(content);
				bbsdto.setWdate(wdate);
				bbsdto.setDel(del);
				bbsdto.setReadcount(readCount);

			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}
		
		return bbsdto;
	}
	
	
	//게시글 insert
	public void Write_Insert(bbsDTO bbsdto) {
		String sql = "INSERT INTO BBS (SEQ, ID, TITLE, CONTENT, WDATE, DEL, READCOUNT) "
				+" VALUES(SEQ_BBS.NEXTVAL,?,?,?,SYSDATE,0,0)";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, bbsdto.getId());
			stmt.setString(2, bbsdto.getTitle());
			stmt.setString(3, bbsdto.getContent());
			
			rs = stmt.executeQuery();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}		
	}
	
	//수정
	public void update(bbsDTO bbsdto) {
		String sql = "UPDATE BBS SET TITLE=?, CONTENT=?, WDATE=SYSDATE, READCOUNT=? WHERE SEQ=? AND ID=?";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, bbsdto.getTitle());
			stmt.setString(2, bbsdto.getContent());
			stmt.setInt(3, (bbsdto.getReadcount()+1));
			stmt.setInt(4, bbsdto.getSeq());
			stmt.setString(5, bbsdto.getId());
			
			rs = stmt.executeQuery();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}		
	}
	
	//조회수 수정
	public void update_readCount(bbsDTO bbsdto) {
		String sql = "UPDATE BBS SET READCOUNT=? WHERE SEQ=? AND ID=?";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, (bbsdto.getReadcount()+1));
			stmt.setInt(2, bbsdto.getSeq());
			stmt.setString(3, bbsdto.getId());
			
			rs = stmt.executeQuery();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}		
	}
	
	
	//Delete revisionClass
	public void delete_bbstable(bbsDTO bbsdto) {
		String sql = "UPDATE BBS SET TITLE='이 게시글은 삭제되었습니다.', CONTENT='이 게시글은 삭제되었습니다.', WDATE=SYSDATE, READCOUNT=? DEL=? WHERE SEQ=? AND ID=?";
		
		Connection conn = DBConnection.makeConnection();
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, (bbsdto.getReadcount()+1));
			stmt.setInt(2, (bbsdto.getDel()+1));
			stmt.setInt(3, bbsdto.getSeq());
			stmt.setString(4, bbsdto.getId());
			
			rs = stmt.executeQuery();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBClose.close(stmt, conn, rs);
		}		
	}

	
}

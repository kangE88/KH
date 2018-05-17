package pds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import mem.MemberDto;

public class PdsDao implements iPdsDao {
	
	private static PdsDao pdsdao = new PdsDao();
	
	private PdsDao() {}
	
	public static PdsDao getInstance() {
		if(pdsdao == null){
			pdsdao = new PdsDao();
		}
		return pdsdao;
	}
	

	@Override
	public boolean write(PdsDto pds) {
		String sql = " INSERT INTO PDS( "
				+ " SEQ, ID, TITLE, CONTENT, FILENAME, "
				+ " READCOUNT, DOWNCOUNT, REGDATE) VALUES (SEQ_PDS.NEXTVAL, "
				+ " ?, ?, ?, ?, 0, 0, SYSDATE) ";
		
	int count =0;
	
	Connection conn = null;
	PreparedStatement psmt = null;
	
	try {
		conn = DBConnection.makeConnection();
		System.out.println("1/6 writePds");
		
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, pds.getId());
		psmt.setString(2, pds.getTitle());
		psmt.setString(3, pds.getContent());
		psmt.setString(4, pds.getFilename());
		System.out.println("2/6 writePds");
		
		count = psmt.executeUpdate();
		System.out.println("3/6 writePds");
		
	} catch (SQLException e) {
		System.out.println("F writePds");
	}finally {
		DBClose.close(psmt, conn, null);
		System.out.println("4/6 writePds");
	}
		
		return count>0?true:false;
	}

	@Override
	public List<PdsDto> getPdsList() {
		String sql = " SELECT SEQ, ID, TITLE, CONTENT, FILENAME, "
				+ " READCOUNT, DOWNCOUNT, REGDATE "
				+ " FROM PDS "
				+ " ORDER BY SEQ DESC ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
			
		List<PdsDto> list = new ArrayList<PdsDto>();
			
		try {
			conn = DBConnection.makeConnection();
			System.out.println("1/6 getPdsList");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("2/6 getPdsList");
			
			rs = psmt.executeQuery();
			System.out.println("3/6 getPdsList");
			
			while(rs.next()) {
				PdsDto dto = new PdsDto(rs.getInt(1), //seq
										rs.getString(2),//id
										rs.getString(3),//title
										rs.getString(4),//content
										rs.getString(5),//filename
										rs.getInt(6),//readcount
										rs.getInt(7),//downcount
										rs.getString(8));//regdate
				
				list.add(dto);
			}
			System.out.println("4/6 getPdsList");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, rs);
			System.out.println("5/6 getPdsList");
		}
		
		return list;
	}

	@Override
	public boolean downloadCount(int seq) {
		String sql = " UPDATE PDS "
				+ " SET DOWNCOUNT=DOWNCOUNT+1 "
				+ " WHERE SEQ=? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.makeConnection();
			System.out.println("1/6 downloadCount");
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, seq);
			System.out.println("2/6 downloadCount");
			
			count = psmt.executeUpdate();
			System.out.println("3/6 downloadCount");
			
		} catch (SQLException e) {
			System.out.println("F downloadCount");
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, null);
		}
		
		return count>0?true:false;
	}
	
	public boolean pdsReadCount(int seq) {
		String sql = " UPDATE PDS "
				+ " SET READCOUNT = READCOUNT+1 "
				+ " WHERE SEQ=? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, seq);
			
			count = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, null);
		}
		
		return count>0?true:false;
	}

	@Override
	public PdsDto getPDS(int seq) {
		String sql = " SELECT SEQ, ID, TITLE, CONTENT, FILENAME, "
				+ " READCOUNT, DOWNCOUNT, REGDATE "
				+ " FROM PDS WHERE SEQ=?";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
			
		PdsDto pdsDto = new PdsDto();
			
		try {
			conn = DBConnection.makeConnection();
			System.out.println("1/6 getPds");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("2/6 getPds");
			
			psmt.setInt(1, seq);
			System.out.println("3/6 getPds");
			
			rs = psmt.executeQuery();
			System.out.println("4/6 getPds");
			
			while(rs.next()){
				seq = rs.getInt(1);
				String id = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				String filename = rs.getString(5);
				int readcount  = rs.getInt(6);
				int downcount = rs.getInt(7);
				String regdate = rs.getString(8);
				
				pdsDto.setSeq(seq);
				pdsDto.setId(id);
				pdsDto.setTitle(title);
				pdsDto.setContent(content);
				pdsDto.setFilename(filename);
				pdsDto.setReadcount(readcount);
				pdsDto.setDowncount(downcount);
				pdsDto.setRegdate(regdate);
			}	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, rs);
			System.out.println("5/6 getPdsList");
		}
		
		return pdsDto;
	}

	@Override
	public boolean pdsDel(int seq) {
		String msg = "이 글은 삭제 되었습니다.";
		
		String sql = " UPDATE PDS SET ( TITLE, CONTENT, FILENAME ) = (?, ?, ?)"
				+ " WHERE SEQ=?";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, msg);
			psmt.setString(2, msg);
			psmt.setString(3, "");
			
			count = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, null);
		}
		
		return count>0?true:false;
	}
	
	

}

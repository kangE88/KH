package bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;

public class BbsDao implements iBbsDao {
	private static BbsDao bbsDao = new BbsDao();
	
	private BbsDao() {
	}
	
	public static BbsDao getInstance() {
		return bbsDao;
	}

	@Override
	public boolean writeBbs(BbsDto dto) {
		int count = 0;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO BBS(SEQ, ID, "
				+ " REF, STEP, DEPTH, "
				+ " TITLE, CONTENT, WDATE, PARENT, " 
				+ " DEL, READCOUNT) "
				+ " VALUES(SEQ_BBS.NEXTVAL, ?, "
				+ " (SELECT NVL(MAX(REF), 0)+1 FROM BBS), 0, 0,"
				+ " ?, ?, SYSDATE, 0, 0, 0) ";
		
		try {
			conn = DBConnection.makeConnection();
			System.out.println("2/6 writeBBS Success");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("3/6 writeBBS Success");
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContent());
			
			count = psmt.executeUpdate();
			System.out.println("4/6 writeBBS Success");
			
		} catch (SQLException e) {			
			System.out.println("writeBBS fail");
		} finally{
			DBClose.close(psmt, conn, rs);			
		}
		
		return count>0?true:false;
	}

	@Override
	public List<BbsDto> getBbsList() {
		List<BbsDto> list = new ArrayList<BbsDto>();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT SEQ, ID, REF, STEP, DEPTH, "
				+ " TITLE, CONTENT, "
				+ "	WDATE, PARENT, "
				+ " DEL, READCOUNT "
				+ " FROM BBS "
				+ " ORDER BY REF DESC, STEP ASC ";
		
		try {
			conn = DBConnection.makeConnection();
			System.out.println("2/6 getBbsList Success");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("3/6 getBbsList Success");
			
			rs = psmt.executeQuery();
			System.out.println("4/6 getBbsList Success");
			
			while(rs.next()){
				int i = 1;
				
				BbsDto dto = new BbsDto(rs.getInt(i++), 	// SEQ
										rs.getString(i++), 	// ID
										rs.getInt(i++),		// REF
										rs.getInt(i++),		// STEP
										rs.getInt(i++),		// DEPTH
										rs.getString(i++), 	// TITLE
										rs.getString(i++), 	// CONTENT
										rs.getString(i++), 	// WDATE
										rs.getInt(i++),		// PARENT
										rs.getInt(i++), 	// DEL
										rs.getInt(i++));	// READCOUNT
				list.add(dto);
			}		
			System.out.println("5/6 getBbsList Success");
			
		} catch (SQLException e) {
			System.out.println("getBbsList fail");
		} finally{
			DBClose.close(psmt, conn, rs);
			System.out.println("6/6 getBbsList Success");
		}
		
		return list;
	}
	
	public BbsDto getBBS(int seq) {
	BbsDto dto = null;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = " SELECT ID, TITLE, WDATE, CONTENT, READCOUNT "
				+ " FROM BBS "
				+ " WHERE SEQ=? ";
		
		try {			
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);	
			
			psmt.setInt(1, seq);			
			rs = psmt.executeQuery();
			
			while(rs.next()){				
				String id = rs.getString(1);
				String title = rs.getString(2);
				String wdate = rs.getString(3);
				String content = rs.getString(4);				
				int readcount = rs.getInt(5);
				
				dto = new BbsDto(seq, id, title, content, wdate, readcount);	
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			DBClose.close(psmt, conn, rs);	
		}
		return dto;
		
	}
	public void readCount(int seq) {
		String sql=" UPDATE BBS SET  "
				+" READCOUNT=READCOUNT+1 "
				+ " WHERE SEQ=? ";
		
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		
		try {
			conn = DBConnection.makeConnection();	
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1, seq);
			
			psmt.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBClose.close(psmt, conn, rs);	
		}		
	}
	
	public boolean answer(int seq, BbsDto bbs) {
		//update
		String sql1 = " UPDATE BBS "
				+ " SET STEP=STEP+1 "
				+ " WHERE REF=(SELECT REF FROM BBS WHERE SEQ=?) "
					// 현재 같은 그룹번호를 찾는다.
				+ " AND STEP > (SELECT STEP FROM BBS WHERE SEQ=?) ";
					// 현재 STEP보다 큰 STEP을 찾는다.
		/*
		 		REF STEP DEPTH
		 		1	0	 0
		 */
		
		
		// insert
		String sql2 = " INSERT INTO BBS "
				+ " (SEQ, ID, REF, STEP, DEPTH, "
				+ " TITLE, CONTENT, WDATE, PARENT, DEL, READCOUNT) "
				+ " VALUES(SEQ_BBS.NEXTVAL, ?, "
				+ " 	(SELECT REF FROM BBS WHERE SEQ=? ),"
				+ "		(SELECT STEP FROM BBS WHERE SEQ=? )+1, "
				+ "		(SELECT DEPTH FROM BBS WHERE SEQ=? )+1, "
				+ " 	?, ?, SYSDATE, ?, 0, 0) ";
		
		int count = 0;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			conn = DBConnection.makeConnection();
			conn.setAutoCommit(false);
			System.out.println("1/6 answer Success");
			
			psmt = conn.prepareStatement(sql1); //update
			psmt.setInt(1, seq);
			psmt.setInt(2, seq);
			System.out.println("2/6 answer Success");
			
			count = psmt.executeUpdate();
			System.out.println("3/6 answer Success");
			
			psmt.clearParameters();
			
			psmt = conn.prepareStatement(sql2);
			
			psmt.setString(1, bbs.getId());
			psmt.setInt(2, seq);	//ref
			psmt.setInt(3, seq);	//step
			psmt.setInt(4, seq);	//depth
			
			System.out.println("bbs.getTitle()=="+bbs.getTitle());
			
			psmt.setString(5, bbs.getTitle());
			psmt.setString(6, bbs.getContent());
			psmt.setInt(7, seq);
			System.out.println("4/6 answer Success");
			
			count = psmt.executeUpdate();
			conn.commit();
			System.out.println("5/6 answer Success");
		
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (Exception e2) {
				// TODO: handle exception
			}
			DBClose.close(psmt, conn, null);
			System.out.println("6/6 answer Success");
		}
				
		return count>0?true:false;
	}
/**/
	public List<BbsDto> getBbsPagingList(PagingBean paging, String searchWord) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		List<BbsDto> bbslist = new ArrayList<>();
		
		//검색어
		String sWord = "%" + searchWord.trim() + "%";
		
		try {
			conn = DBConnection.makeConnection();
			System.out.println("1/6 S getBbsPagingList");
			
			String totalSql = " SELECT COUNT(SEQ) FROM BBS WHERE TITLE LIKE '" + sWord + "'";
			psmt = conn.prepareStatement(totalSql);
			rs = psmt.executeQuery();
			
			int totalCount = 0;
			rs.next();
			totalCount = rs.getInt(1);	// row의 총 갯수
			paging.setTotalCount(totalCount);
			paging = PageingUtil.setPagingInfo(paging);
			
			psmt.close();
			rs.close();
			
			String sql = " SELECT * FROM"
					+ " (SELECT * FROM (SELECT * FROM BBS  WHERE TITLE LIKE '" + sWord + "' ORDER BY REF ASC, STEP DESC) "
					+ " WHERE ROWNUM <=" + paging.getStartNum() + " ORDER BY REF DESC, STEP ASC) "
					+ " WHERE ROWNUM <=" + paging.getCountPerPage();
						
			psmt = conn.prepareStatement(sql);
			System.out.println("2/6 S getBbsPagingList");
			
			rs = psmt.executeQuery();
			System.out.println("3/6 S getBbsPagingList");
			
			while(rs.next()){
				int i = 1;
				BbsDto dto = new BbsDto(
						rs.getInt(i++),		// seq 
						rs.getString(i++),	// id 
						rs.getInt(i++),		// ref 
						rs.getInt(i++), 	// step 
						rs.getInt(i++), 	// depth 
						rs.getString(i++), 	// title
						rs.getString(i++), 	// content 
						rs.getString(i++), 	// wdate 
						rs.getInt(i++),    	// parent 
						rs.getInt(i++),		//	del 
						rs.getInt(i++));	// readcount
				bbslist.add(dto);				
			}	
			System.out.println("4/6 S getBbsPagingList");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			DBClose.close(psmt, conn, rs);
			System.out.println("5/6 S getBbsPagingList");
		}		
		
		return bbslist;
	}

	@Override
	public boolean Modify(int seq, String title, String content) {
		String sql=" UPDATE BBS SET  "
				+" TITLE=?, "
				+" CONTENT=?"
				+ " WHERE SEQ=? ";
		
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		
		int count = 0;
		
		try {
			conn = DBConnection.makeConnection();	
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, content);
			psmt.setInt(3, seq);
			
			count = psmt.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBClose.close(psmt, conn, rs);	
		}

		
		return count>0?true:false;
	}
	
	
	
}

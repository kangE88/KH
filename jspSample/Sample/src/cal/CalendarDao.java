package cal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import db.DBClose;
import db.DBConnection;

public class CalendarDao implements iCalendarDao {

	//Singleton
	private static CalendarDao calendarDao = new CalendarDao();
	
	private CalendarDao() {	}
	
	public static CalendarDao getInstance() {
		return calendarDao;
	}
	
	@Override
	public boolean addCalendar(CalendarDto cal) {
		
		String sql = " INSERT INTO CALENDAR( "
				+ " SEQ, ID, TITLE, CONTENT, RDATE, WDATE) "
				+ " VALUES(SEQ_CAL.NEXTVAL, "
				+ " ?, ?, ?, ?, SYSDATE) ";
		
		Connection conn = null;
		PreparedStatement psmt = null;

		int count = 0;
		
		try {	
			conn = DBConnection.makeConnection();
			System.out.println("1/6 adCalendar Success");
		
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, cal.getId());
			psmt.setString(2, cal.getTitle());
			psmt.setString(3, cal.getContent());
			psmt.setString(4, cal.getRdate());
			
			System.out.println("2/6 adCalendar Success");
			
			count = psmt.executeUpdate();
			System.out.println("3/6 adCalendar Success");
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("fail adCalendar");
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, null);
			System.out.println("4/6 adCalendar Success");
		}
		
		return count>0?true:false;
	}

	@Override
	public List<CalendarDto> getCalendarList(String id, String yyyyMM) {
		
		String sql = " SELECT "
				+ " SEQ, ID, TITLE, CONTENT, RDATE, WDATE "
				+ " FROM ( "
				+ " SELECT ROW_NUMBER() "
				+ " OVER(PARTITION BY SUBSTR(RDATE, 1, 8) "
				+ " ORDER BY RDATE ASC) RN, "
				+ " SEQ, ID, TITLE, CONTENT, RDATE, WDATE "
				+ " FROM CALENDAR "
				+ " WHERE ID=? AND SUBSTR(RDATE, 1, 6)=?) "
				+ " WHERE RN BETWEEN 1 AND 5 ";
		
		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null;
		
		List<CalendarDto> list = new ArrayList<CalendarDto>();
				
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			System.out.println("1/6 getCalendarList");
			
			psmt.setString(1, id.trim());
			psmt.setString(2, yyyyMM.trim());
			System.out.println("2/6 getCalendarList");
			
			rs = psmt.executeQuery();
			System.out.println("3/6 getCalendarList");
			
			while(rs.next()) {
				CalendarDto dto = new CalendarDto();
				
				dto.setSeq(rs.getInt(1));
				dto.setId(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setRdate(rs.getString(5));
				dto.setWdate(rs.getString(6));
				
				list.add(dto);
			}
			System.out.println("4/6 getCalendarList");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("fail getCalendarList");
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
			System.out.println("5/6 getCalendarList");
		}
		
		return list;
	}

	@Override
	public CalendarDto getCalendar(String id, int seq) {
		String sql = " SELECT ID, TITLE, CONTENT, RDATE "
				+ " FROM CALENDAR WHERE ID = ? AND SEQ = ? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		CalendarDto dto = new CalendarDto();
		
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setInt(2, seq);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setRdate(rs.getString("rdate"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
		}
		
		return dto;
	}
	
	@Override
	public CalendarDto getDay(int seq) {
		String sql = " SELECT SEQ, ID, TITLE, CONTENT, RDATE "
				+ " FROM CALENDAR WHERE SEQ = ? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		CalendarDto dto = new CalendarDto();
		
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			System.out.println("1 getDay");
			
			psmt.setInt(1, seq);
			System.out.println("2 getDay");
			
			rs = psmt.executeQuery();
			System.out.println("3 getDay");
			
			while(rs.next()) {
				dto.setSeq(rs.getInt("seq"));
				dto.setId(rs.getString("id"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setRdate(rs.getString("rdate"));
			}
			System.out.println("4 getDay");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
			System.out.println("5 getDay");
		}
		
		return dto;
	}
	
	@Override
	public List<CalendarDto> getDayList(String id, String dates) {
		String sql = " SELECT SEQ, TITLE, CONTENT, RDATE "
				+ " FROM CALENDAR WHERE ID = ? AND SUBSTR(RDATE, 1, 8)= ? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		System.out.println("getDayList dates===>"+dates);
		
		List<CalendarDto> list = new ArrayList<CalendarDto>();
		
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			System.out.println("1 getDayList");
			
			psmt.setString(1, id);
			psmt.setString(2, dates);
			System.out.println("2 getDayList");
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				CalendarDto dto = new CalendarDto();
				
				dto.setSeq(rs.getInt("seq"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setRdate(rs.getString("rdate"));
				
				list.add(dto);
				
			}
			System.out.println("3 getDayList");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
		}
		
		return list;
	}

	@Override
	public boolean UpdateCalendar(int seq, String title, String content) {
		
		String sql = " UPDATE CALENDAR SET TITLE= ?, CONTENT= ? "
					+ " WHERE SEQ=? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
				
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, title);
			psmt.setString(2, content);
			psmt.setInt(3, seq);
			
			count = psmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return count>0?true:false;
	}	
	
	

}

package kh.com.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.com.a.dao.CalendarDao;
import kh.com.a.model.CalendarDto;

@Repository
public class CalendarDaoImpl implements CalendarDao {

	@Autowired
	SqlSession sqlSession;
	
	private String ns = "Calendar.";

	@Override
	public List<CalendarDto> getCalendarList(CalendarDto fcal) throws Exception {
		// TODO Auto-generated method stub
		List<CalendarDto> list = sqlSession.selectList(ns+"getCalendarList", fcal);
		return list;
	}

	@Override
	public boolean addCalendar(CalendarDto cal) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(ns+"writeCalendar", cal);
		return true;
	}

	@Override
	public CalendarDto getCalendar(int seq) throws Exception {
		// TODO Auto-generated method stub
		CalendarDto cal = new CalendarDto();
		
		cal = sqlSession.selectOne(ns+"getCalendar",seq);

		return cal;
	}

	@Override
	public boolean updateCalendar(CalendarDto cal) throws Exception {
		// TODO Auto-generated method stub

		sqlSession.update(ns+"updateCalender"+cal);
		
		return true;
	}
	
	
	
/*
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
	}	*/
	
	

}

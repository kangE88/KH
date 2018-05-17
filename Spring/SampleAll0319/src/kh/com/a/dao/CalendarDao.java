package kh.com.a.dao;

import java.util.List;

import kh.com.a.model.CalendarDto;

public interface CalendarDao {
	public List<CalendarDto> getCalendarList(CalendarDto fcal) throws Exception;
	public boolean addCalendar(CalendarDto cal) throws Exception;
	public CalendarDto getCalendar(int seq) throws Exception;
	public boolean updateCalendar(CalendarDto cal) throws Exception;
}

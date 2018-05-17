package kh.com.a.service;

import java.util.List;

import kh.com.a.model.CalendarDto;

public interface CalendarService {
/*
	CalendarDto getCalendar(String id, int seq) throws Exception;
	CalendarDto getDay(int seq) throws Exception;
	List<CalendarDto> getDayList(String id, String dates) throws Exception;
	boolean UpdateCalendar(int seq, String title, String content) throws Exception;*/
	public List<CalendarDto> getCalendarList(CalendarDto fcal) throws Exception;
	boolean addCalendar(CalendarDto cal) throws Exception;
	public CalendarDto getCalendar(int seq) throws Exception;
	boolean UpdateCalendar(CalendarDto cal) throws Exception;
}

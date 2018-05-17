package kh.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.com.a.dao.CalendarDao;
import kh.com.a.model.CalendarDto;
import kh.com.a.service.CalendarService;

@Service
public class CalendarServiceImpl implements CalendarService{

	@Autowired
	CalendarDao calendarDao;

	@Override
	public List<CalendarDto> getCalendarList(CalendarDto fcal) throws Exception{
		// TODO Auto-generated method stub
		return calendarDao.getCalendarList(fcal);
	}

	@Override
	public boolean addCalendar(CalendarDto cal) throws Exception {
		// TODO Auto-generated method stub
		return calendarDao.addCalendar(cal);
	}

	@Override
	public CalendarDto getCalendar(int seq) throws Exception {
		// TODO Auto-generated method stub
		return calendarDao.getCalendar(seq);
	}

	@Override
	public boolean UpdateCalendar(CalendarDto cal) throws Exception {
		// TODO Auto-generated method stub
		calendarDao.updateCalendar(cal);
		return true;
	}
	
	
	
}

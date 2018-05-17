package cal;

import java.util.List;

public interface iCalendarDao {
	
	boolean addCalendar(CalendarDto cal);
	List<CalendarDto> getCalendarList(String id, String yyyyMM);
	public CalendarDto getCalendar(String id, int seq);
	public CalendarDto getDay(int seq);
	public List<CalendarDto> getDayList(String id, String dates);
	boolean	UpdateCalendar(int seq, String title, String content);

}

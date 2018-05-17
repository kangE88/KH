import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {
		// Calendar cal = new GregorianCalendar();
		
		Calendar cal = Calendar.getInstance();
		
		//취득 get
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		//설정 set
		/*
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.APRIL);
		cal.set(Calendar.DATE, 25);
		
		 year = cal.get(Calendar.YEAR);
		 month = cal.get(Calendar.MONTH)+1;
		 day = cal.get(Calendar.DATE);
		
		System.out.println(year+"년 "+month+"월 "+day+"일");
		*/
		
		//오전 오후
		String ampm = cal.get(Calendar.AM_PM) == 0 ?"오전":"오후";
		
		System.out.println("ampm == "+ampm);
		
		
		int weekDay = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("weekDay === "+weekDay);
		
		switch(weekDay) {
			case 1:
				System.out.println("일요일");
				break;
			case 2:
				System.out.println("월요일");
				break;
			case 3:
				System.out.println("화요일");
				break;
			case 4:
				System.out.println("수요일");
				break;
			case 5:
				System.out.println("목요일");
				break;
			case 6:
				System.out.println("금요일");
				break;
			case 7:
				System.out.println("토요일");
				break;
	}
		
		//회원가입
		//게시판(답변)
		//일정관리 
		//자료실
		//투표
		
		//cal.set(Calendar.MONTH,month-1);
		
		//지정한 달의 마지막 날짜 
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("lastDay == "+lastDay);
		
		//d연월일을 설정하면 달력의 빈칸이 몇개 있는지
		
		year = 2017;
		month = 11;
		day =1;
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		System.out.println("==> "+year+"년 "+month+"월 "+day+"일");
		
		weekDay = cal.get(Calendar.DAY_OF_WEEK); //요일 1-7
		
		System.out.println("weekDay==2= "+weekDay);
		
		int _day = (weekDay - 1) % 7;
		
		System.out.println("이 달의 윗쪽의 빈칸 수 : "+_day);
		
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		cal.set(Calendar.DATE, lastDay);
		
		weekDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("weekDay == "+weekDay);
		
		int _lastDay = 7 - weekDay;
		System.out.println("이 달의 밑쪽 빈칸 수 : "+_lastDay);
		
		

	}

}

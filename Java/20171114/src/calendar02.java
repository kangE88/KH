import java.util.Calendar;

public class calendar02 {
	public static void main(String[] arg) {
		//년도 월
		
		//캘린더
		//일 월 화 수 목 금 토
		//         1 2  3 4
/*
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH); // 0월이 1월 ~ 11까지 출력
		System.out.println(month+1);
		
		int day = cal.get(Calendar.DATE);
		System.out.println("day == "+day);
		
		cal.set(Calendar.DATE, 1); // 날짜 바꾸기 셋팅

		int weekday = cal.get(Calendar.DAY_OF_WEEK); // 요일 가져오기
		
		System.out.println(weekday);  //날짜가 1일로 변경되어 4(수요일이 세팅)
		
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 해당 달의 마지막날짜 가져오기
		
		System.out.println(lastday); // 11월이기 떄문에 30으로 셋팅
		
		int _lastday = 7-weekday; //
		
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		for(int i=1;i<weekday;i++) {
			System.out.print("-\t");
		}
		for (int i = 1; i <= lastday; i++) {
			System.out.print(i+"\t");
			if(weekday %7==0) {
				System.out.println();
			}
			weekday++;
		}

		for (int i = 1; i < _lastday; i++) {
			System.out.print("-\t");
		}
*/
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR); // 년
		int month = cal.get(Calendar.MONTH)+1;//월
		int day = cal.get(Calendar.DATE);//일
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		//달력 출력 하기
		
		//일자를 1일로 설정
		cal.set(Calendar.DATE, 1);
		
		//1일이 몇 요일인지 가져오기
		int weekDay = cal.get(Calendar.DAY_OF_WEEK); //수요일 4   일요일 부터 1 -> 토요일까지 7
		
		System.out.println(weekDay);  
		
		//마지막 날짜 가져오기
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println(lastday);
		
		System.out.println("일\t월\t화\t\t\t\t\t\t\t\t\t");
		for(int i=1; i<weekDay;i++) {
			System.out.print("-\t");
		}
		
		
		
		
		
		





		
		
		


		
		
	}
}

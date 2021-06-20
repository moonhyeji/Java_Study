package com.cal02;
import java.util.Calendar;

//java.util.calendar사용하여, 달력만들기.

public class CalendarUseApi {

	
	public void prn(int year, int month) {   //prn이라는 메소드를 만들자. 입력할 값은 이어와 먼스. 
		
		Calendar cal = Calendar.getInstance();
		
		/*
       캘린더의 getinstance 메소드는 = (현재 날자와 시간으로 초기화된 필드를 가진 ) 캘린더 객체를 리턴한다. // 현재 날짜를 가져옴. 
       <<<<<<<캘린더메소드<<<<<  Calendar rightNow = Calendar.getInstance();>>>>>>>>>>>
               cal이라는 변수에 현재날짜를 저장. 
               
    ****** calendar.getinstance는 싱글톤이라고 말함. 캘린더 값이 필요한데 캘린더 값을 내려면 이렇게 만들어라라고 하는 틀. 
    * 원래는 calender cal = new calendar(); 라고 썼었는데 이제는 얘가 구동이 안됨. <- 이렇게 못씀.!!! 
    *singleton -> 객체를 단 한번만 생성. (싱글톤 = 단독객체)
     
     
     
     
     */ //******getinstance = 해당 캘린더객체를 연결해주는(만드는) 메소드. 지정 시간대와 장소를 기준으로 캘린더 객체를 만들거야. return:은 캘린더야. 
		
		// 달력형태를 만들기 
		System.out.printf("\t\t%d년  %d월\n", year, month);  //출력시  탭탭(변수가정수형%d) 년  월 뒤에는 줄바꾸기.
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");    // 출력시 그 밑에 출력시 일 탭 월 탭 ... 줄바꾸기.  

		
		
		//********cal.set : '해당 월의 일'을 넣어줘라 .세팅하라.
		//year 년 month월 1일로 calendar 객체 설정. 
		//#####year년 month월 1일로 calender객체 설정.
		cal.set(year, month-1, 1);        //    해당년도 해당월 해당일로 캘린더를 바꿔버리겠다. 라는        //?????????????? /set: 캘린더 필드의 연도 월 일의 값을 가져옴. 
		// from api - january whichi is 0;라고 되어있음. 1월이라는 값을 주고 싶으면 -1 
		
		
		
		
		//DAY OF WEEK:일욜 부터 토욜까지의 값을 가지고 있음. 일욜은 무슨값 가지고 잇나? constant field value: 저장된 상수값 확인해 봐라. - 들어가보면 sunday = 1 이라고되어있음. 
		//토욜은 7이라고 되어있음. 따라서 월욜은 1. 화는 2. 수는 3.... 토는 7이라고 되어있다. 
		
		// year년 month월 1일의 요일 값(1: 일 2:월......7: )
		          //cal.get(calendar.day of week)해당년도 해당월 1일의 요일값을 가지고 와라 하는 것. 
		
		
		
		
		//####start: 어떤년도 어떤월 어떤 일의 요일 값.이다. year 1: 일요일 2: 화요일 ....7:토요일)
		int start = cal.get(Calendar.DAY_OF_WEEK);  
		// Calender.DAY_OF_WEEK : 캘린더의 요일값을 반환한다. 
		//DAY_OF_WEEK처럼(대문자로 쓰여진 필드는 '상수'이다./DAY_OF_WEEK 의 상수는 1부터 7까지 이다. 
		// get: 주어진 캘린더 필드의 값을 반환한다.
		
		
		
		
		//////////////////////일월화수목 만큼 공백을 주자!///////////////////////
		
		//-----------> 달력의 맨 처음 달의 일 앞의 공백을 출력. 
		
		
		//#####요일 앞 공백 
		for(int i =1; i<start; i++) {      // i가 일이고(초기값) start보다 작으면(조건)
			
			System.out.printf("\t");    //트루면 - 탭을 출력한다. //// 아니면 - i 에  1을 더한다. 
			
			//start변수에 시작일의 요일을 구함. 1-7의 값을 리턴해줌. 
			//*********//해당년도 해당월 1일의 요일이 나왔다. 예를들어 2021년 1월 의 1일은 금요일.  앞의 5 번 공백이 들어가야 여섯번째에 1이 들어감.
			//일월화수목 만큼 공백을 주자!
			
		}
		
		
		//----------------------> 달력의 '일' 을 출력
		//######i: 1일부터 해당 연.월의 마지막 일까지 
		for (int i =1; i <= cal.getActualMaximum(Calendar.DATE);i++) { 
			//getactualmaximum : 특정한 캘린더 필드가 가질 수 있는 최대값을 리턴한다. = 해당 달의 마지막 날짜를 리턴.:the maximum of the given calendar field for the time value of this Calendar
			
			//date필드: 달의 첫번째 값은 1이고, 해당 달의 날짜(일)를 의미한다. 
            //*************    i: 1일부터 연.월의 마지막 일까지 해당한다.               
			//DATE는 자바가 자동으로 계산해서 줌. 1월이면 31. 2월이면 30... 이런식으로.
			
			
			
			
			//####달력의 일 출력.
			System.out.printf("%d\t", i);        // %d라는 숫자가 i 를 대변.
		    // i 가 1일 때 start는 6, 
			// i가 2일 때 start는 7
			// i가 1일때 금요일 i가 2일 때토요일. i가 3일 때는 다음줄에 출력해야 해서 
		
			
			//########## 요일값(1~7)을 증가시키면서 , 7의 배수가 되면 다음줄로 간다. 
			if(start % 7 == 0) {  
				//만약 start변수가 7을 나누어서 떨어지면)  
				// 일주일이 7일이니까 
				// 1일의 요일인 start부터 시작해서출력해야 
				
				
				
			System.out.println();      //출력한다. 
		}
               			start++;     // 아닐경우 start변수에 1을 더한다. 			
		}
		
	}
	
}


// 목적: api 잘 읽고 활욜하기 ^^....

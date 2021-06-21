package com.compare;

public class Score implements Comparable<Object> {

	private String name;
	private int kor;
	private int eng;
	private int math;

	public Score() {

	}

	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	
	//getter&Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		
	}public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		
	}
	
	
	public int getSum() {
		return kor + eng + math;
	}
	public double getAvg() {
		return (double)getSum()/3;
		
	}
	
	public String getGrade() {
		String res = "F";
		
		

		
		switch((int)getAvg() /10 ) {
		case 10: 
		case 9:
			res = "A";
			break;
		case 8:
			res = "B";
			break;
		case 7:
			res ="C";
			break;
		case 6:
			res ="D";
			break;
		
		}
		return res;
	
	}
	
	
	@Override
	public String toString() {
		return "이름 : " + name +"국어 : "+ kor+ "영어 : "+eng + "수학 : " + math + "총점 :" + getSum() + "평균 : " + getAvg()
				+ "등급 : " + getGrade();
	
	}

	//나 (this)와 다른 객체 (other)를 비교/
	/*
	 * 
	 *a>b : +
	 *a== b :0
	 *a<b :-
	 * 
	 */
	
	@Override
	public int compareTo(Object o) {
		
		Score other =(Score)o;
		
		
	    System.out.println(this.name + "vs"+ other.getName());  //>>하면 vs로 비교하는게 나옴. 
	    //compare to 라는 애는 나와 다른 애들 비교해줌. : 나에서 다른 애를 비교해 주는 것. 
		
		
		if(this.getAvg() > other.getAvg()) {
			return 1;
		}else if(this.getAvg() == other.getAvg()) {
			return 0;
			
		}else if(this.getAvg() < other.getAvg()) {
		return -1;
		}
		
		return 0;
	}
}

// 평균을 기준으로 오름차순으로 나오고 있음. 

/*
 * collection 순서가 있고 중복이 가능하다. 
 * 
 */



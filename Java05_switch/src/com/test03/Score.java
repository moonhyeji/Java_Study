package com.test03;

public class Score {

	public static void main(String[] args) {
		
		
	static double getAvg(int kor, int eng, int math) {
	   
		//double res = 0;
	    
		//int sum = kor + eng + math;
		//res = (double) sum / 3;
		return (double)(kor + eng + math)/3;
		
		
		//return 0;
		//더블의 초기값으로 써놓음. 안쓰면 에러남.
		// 
		
	}
		
	public static String getGrade(double avg) {
		
		switch((int)avg/10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
				
		}
       }
	      }
        }
      }

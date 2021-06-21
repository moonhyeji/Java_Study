package com.generic;

//<> = generic(s) ->타입을 강제한다..프로그래머가 의도한 타입만 저장할 수 있도록 타입을 강제신키다. 
//예를들어 integer면 integer타입만 들어가게 할 수 있도록. 



//여러 참조 변수가 사용될 수 있는 곳에 특정한 자료변수를 지정하지 앟ㄴ고 클래스나 메소드를 정의한 후 사용하는 시점에서 자료변수를 지정하는 방법.
// T : 자료형 매개변수








public class Emp<T> {  //t는 타입.  /e:element / k:key / v:value
	                //T대신에 A,B같은 다른거 써도 되는데 타입의 경우 암묵적으로 T라고 쓰자 라고 한거 .
	

	private T empno;         //generic해서 해당타입으로 강제시킬 수 있다. 
	private String ename;
	
	
	
	public Emp() {
	}
	
	public Emp( T empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	
	public T getEmpno() {
		return empno;
	}
	public void setEmpno(T empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	 
public String toString() {
	return empno + ":" + ename;
	
}

}

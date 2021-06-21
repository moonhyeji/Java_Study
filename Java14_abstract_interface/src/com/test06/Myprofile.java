package com.test06;

public class Myprofile extends Profile implements Display, Job {

	
	
	private String loc;
// 	내 객체가 만들어진 이후에 loc에 객체를 넣어주겠다.
	

	//(1)부모가 기본생성자가 없어서 내가 기본생성자를 호출해 줄 수없어서.
		//(2)그래서 파라미터두개짜리 생성자 호출해주면 되는데 
//     (1)public Myprofile() {
  //  	 (2)super(" 철수" ,"010 - 1111 -1111");
    // }
	//- 이렇게 써도 되는데 잘 안씀. 
	//// 기본 생성자 안되는 이유가 뭘까?
   // 생성자가 하나도없을때만 컴파일러가 자동 추가 해준다. 있으면 추가안해줌 

	
//부모가 기본생성자가 없어서 내가 기본생성자를 호출해 줄 수없어서.
	//그래서 파라미터두개짜리 생성자 호출해주면 되는데 
	
	
	public Myprofile(String name, String phone) {  // 생성자에 인자로 name. 과 phone을 받고 
		     super(name, phone);     // << 받은 인자를 상위클래스의 생성자로 보냄. 
		
		//이렇게 사용하면 추상클래스에서 정의했던 생성자를 이용하게되고 ,
		//추상클래스의 멤버필드인 Profile 에 String name,String phone 을 등록 할 수 있다. 

		}

	
	
	
	
	
// 사실 setter의 기능을 하고 있다: setter: 필드값을 설정해주는 메소드. 
	//loc라는 필드에 값을 넣어주겠다. 
	@Override
	public void jobLoc(String loc) { 
		//this -> 내 "객체" ( 여기서객체는 클래스를 가지고 메모리에 실제구현한 거라 . 클래스는 마이프로필.)
		this.loc= loc;   //클래스 내의 loc변수를 선언. 
		               // this.loc은   현재객체(MyProfile)에 그 loc값을 넣어준다
	
	}
	
	
	
	

	
	@Override     // display 메소드를 재정의  함. 
	public void display() {
		//super -> 부모"객체"
		super.printProfile();  // 부모클래스에서 받아서 먼저 출력되엇음. 
	 System.out.println("회사주소:" + loc);
	//  JOB_ID = "Singer";  -final이라서 할당될 수 없음. 
     System.out.println("직무: " + JOB_ID);
    // super.JOB_ID  ->super는 부모객체를 말한다. 부모객체가 되려면 부모클래스여야 하는데 jobid는 인터페이스꺼라 사용못함.
	//JOB.JOB_ID 라고 해야 함. 
	
	}
	
	
}

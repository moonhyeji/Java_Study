package com.test01;
import java.util.Vector;

public class MTest01 {

	
	/*
	 * 
	 *java.util.vactor
        The Vector class implements a growable array of objects.
	 */
	//////////////////////////////		//Vector////////////////////////
	
	public static void main(String[] args) {
		//Vector
		
		// initial capacity : 최대로 들어갈 수 잇는 용량. / capacity increment :용량이 최대로 들어간 후 5씩 증
		//Vector(10,5) ->iCa: 10/ caInc:5
		// -> 10의 용량을 가진 vector만드는데, 꽉 찬 후에 값을 또 넣어주면 용량이 5증가해라. 
		Vector<Integer> v =new Vector<Integer>(10, 5);
		System.out.println(v.size()+":"+v.capacity());   //0:10 
	
	 for (int i =0; i<9; i++) {
		 v.add(i);
		 
	 }
	System.out.println(v.size() + ":"+ v.capacity());   ///   9:10
	

	System.out.println("-------------------");
	System.out.println(v);   //[0, 1, 2, 3, 4, 5, 6, 7, 8]

	System.out.println("-------------------");

	
	v.add(9);
	System.out.println(v.size() + ":" + v.capacity());   //10:10

	System.out.println("-------------------");

	System.out.println(v);  //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

	// 최대로 들어갈 수 있는 곳 총 10개를 넣을 수 있는 10칸짜리에 , 10개를 넣어놨다.
	
	
	// 여기서 한개를 더 넣으면 . 11번째 애가 들어가면 , 꽉 찼을 때 하나가 더 들어가는거고, 
	//꽉찼을 때 때 하나 더 들어가면 용량이 5개 씩 늘어나라 하는 것. 
	System.out.println("-------------------");

	
	v.add(10);
	System.out.println(v.size() + ":" + v.capacity());
	System.out.println(v);
	// 하나가 더 들어갔으니까 11이고 용량은 15가 되는 것. 
	
	
	
	
	
	
	
   Vector vector = new Vector();
   vector.add(1);
   vector.add(3);
   vector.add(3);
   vector.add(3);
   vector.add(2);

   System.out.println(vector);
   //문자, 숫자 상관 없이 넣을 수 있음. //출력값: [1,2,3]
	
	
	
	
	
	
	}
}










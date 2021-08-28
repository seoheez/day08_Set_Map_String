package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		Iterator it = arr.iterator();
		
		while(it.hasNext() == true) {
			System.out.println(it.next());  
		}
		/*
		System.out.println(it.hasNext()); //다음 값이 있는지 없는지 확인
		System.out.println(it.next());

		System.out.println(it.hasNext());
		System.out.println(it.next());
	
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
//		System.out.println(it.next()); //값이 없으면 false */

	}

}

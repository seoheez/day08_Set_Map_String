package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04_Map {

	public static void main(String[] args) {

		/*
		 * < Map > 
		 *  HashMap 
		 *   키와 값의 쌍이다.
		 *   순서는 유지되지 않는다.
		 *   키에 대한 중복은 허용하지 않는다.
		 *   
		 *  TreeMap
		 *  HashTable...등
		 */
		HashMap map = new HashMap();
//		LinkedHashMap map = new LinkedHashMap(); //순서 유지
		map.put("선풍기", "1000만원");
		map.put("자동차", "10만원");
		map.put("에어컨", "30만원");
		System.out.println(map);
		System.out.println(map.get("선풍기"));
		System.out.println(map.get("자동차"));
		System.out.println(map.get("에어컨"));
		System.out.println(map.get("없는키"));
		
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map.containsKey("에어컨111"));
		
		System.out.println(map.containsValue("30만원"));
		System.out.println(map.containsValue("32만원"));
		
		System.out.println(map.remove("에어컨"));
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map);
		
		System.out.println(map.keySet());
		
//		Set s = map.keySet();
//		Iterator it = s.iterator(); //합치면
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
	}

}

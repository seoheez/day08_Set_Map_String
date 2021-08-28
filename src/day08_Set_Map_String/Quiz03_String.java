package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz03_String {

	public static void main(String[] args) {

		//1번
		String str = new String("Have a nice day Have a nice day Have a nice day");
		int i = 0;
		ArrayList arr = new ArrayList();
		while(i < str.length()) {
			if(str.charAt(i) == 'a')
				arr.add(i);
			i++;

		}
		System.out.println(arr);

		//2번
		System.out.println("-----------------------------------");
		
		String str01 = new String("It is a fun java programming");
		int j = 0;
		int cnt_a = 0, cnt_g = 0, cnt = 0;
		while(j < str01.length()) {
			if(str01.charAt(j) == 'a')
				cnt_a++;
			else if(str01.charAt(j) == 'g')
				cnt_g++;
			j++;
		}
		System.out.println("총 개수 : " + str01.length());
		System.out.println("a 개수 : " + cnt_a);
		System.out.println("g 개수 : " + cnt_g);

		
		//3번
		System.out.println("-----------------------------------");
		
		String str02 = new String("tESt sTring change first");
		String changeStr = new String();
		int k = 0;
		
		str02 = str02.toLowerCase();
		if(str02.charAt(0) >= 'a' && str02.charAt(0) <= 'z') {
			changeStr += (char)(str02.charAt(k) - 32);
			k++; //k=1
		}
		while(k < str02.length()) {
			if(str02.charAt(k) != ' ') {
				changeStr += str02.charAt(k);
				k++;
				continue;
			}
			while(str02.charAt(k) == ' ') {
				changeStr += str02.charAt(k);
				k++;
			}
			if(str02.charAt(k) >= 'a' && str02.charAt(k) <= 'z')
				changeStr +=(char)(str02.charAt(k) - 32);
			k++;
		}
		System.out.println(str02);
		System.out.println(changeStr);
		System.out.println("종료");
				
		
		
	}





}



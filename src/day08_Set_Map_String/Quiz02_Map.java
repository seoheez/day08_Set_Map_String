package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz02_Map {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashMap map = new HashMap();
		String name = null;
		String price = null;
		int num = 0;
		while(true) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println(">>>");

			num = scan.nextInt();
			if(num == 1) {
				System.out.println("메뉴 입력 : ");
				name = scan.next();
				if(map.containsKey(name) == false) {
					System.out.println("가격 입력 : ");
					price = scan.next();
					map.put(name, price);
					System.out.println("등록 되었습니다.");
				} else {
					System.out.println("존재하는 메뉴 입니다.");
				}
			}else if(num == 2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name + ":" + map.get(name));
				}
				System.out.println("1. 수정 | 2. 삭제 | 3. 나가기");
				System.out.println(">>>");
				int choice = scan.nextInt();
				if(choice == 1) {
					System.out.println("변경 메뉴이름 입력 : ");
					name = scan.next();
					if(map.containsKey(name)) {
						System.out.println("수정 가격 입력 :");
						String newPrice = scan.next();
						System.out.println(map.get(name) + "->" + newPrice);
						System.out.println("변경 됐습니다!");
						map.replace(name, newPrice);
					} else {
						System.out.println("메뉴가 없습니다!");
					}
				}
				else if(choice == 2) {
					System.out.println("삭제할 이름 입력 : ");
					name = scan.next();
					if(map.containsKey(name)) {
						map.remove(name);
						System.out.println(name + "이(가) 삭제 됐습니다!");
					} else { System.out.println(name + "은(는) 없는 이름입니다.");
					}

				}	

			}else break;

		}

	}
}
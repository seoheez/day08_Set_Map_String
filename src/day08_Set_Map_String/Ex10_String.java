package day08_Set_Map_String;

public class Ex10_String {

	public static void main(String[] args) {

		String str = "    Have a nice day     ";
		String result = str.trim();
		System.out.println("1. " + str);
		System.out.println("2. " + result);
		
		String inputId = "abcd    ";
		String saveId = "abcd";
		System.out.println(inputId);
		System.out.println(saveId);
		
		System.out.println(inputId.length());
		System.out.println(saveId.length());
		inputId = inputId.trim();
		System.out.println(inputId.equals(saveId));
		
		String[] split = result.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		String addr = "101/서울시/종로구/종로3가/100번지/4층";
		String[] ad = addr.split("/");
		
		for(int i=0; i < ad.length; i++) {
			System.out.println(ad[i]);
		}
		
		String replace = result.replace(" ", "+++");
		System.out.println(replace);
		
		
	}

}

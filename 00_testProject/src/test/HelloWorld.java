package test;

public class HelloWorld {

	public static void main(String[] args) {
		
//		이클립스에서 실행 : Ctrl + F11
		/* 자바 주석 맛보기 */
		System.out.println("Hello World!!");
		String name = "김일현";
		char gender = '남';
		System.out.println(name);
		System.out.println(gender);
		
		int num;
		boolean isTrue;
		double pi;
		String str = "기타" + 123 + 45 + "출발";
		String str2 = 123 + 45 + "기차" + "출발";
		System.out.println(str);
		System.out.println(str2);
	}
}

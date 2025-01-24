package com.kh.condition;

import java.util.Scanner;

public class Swutch {
	/*
	 * switch
	 * : if문과 동일한 조건문이지만, 동등비교를 통해 흐름을 제어
	 * (실행할 코드만 실행하고 자동으로 종료되지 않음 => 직접 종료가 될 수 있게 설정!!(break)
	 * 
	 * switch(비교대상) {	// 비교대상(변수/식) --> 정수, 문자, 문자열
	 * 	case 값 : 		// 비교대상 == 값
	 * 		실행코드;
	 * 	case 값2 : 		// 비교대상 == 값2
	 * 		실행코드;
	 * ...
	 * 	default : 		// 위에 모든 case가 해당되지 않을 때
	 * 		실행코드;
	 * }
	 */
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();

	}
	
	public static void method1() {
		/*
		 * 정수를 입력받아, 아래조건에 따라 출력.
		 * - 1 : "빨간색"
		 * - 2 : "파란색"
		 * - 3 : "초록색"
		 * - 그 외 : "잘못 입력하였습니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 중 원하는 정수입력 : ");
		int color = sc.nextInt();
		
		/*
		switch (color) {
		case 1 : 					// color == 1
			System.out.println("빨간색");
			break;					// 위의 내용 실행 후 switch 종료!
		case 2 : 					// color == 2
			System.out.println("파란색");
			break;
		case 3 : 					// color == 3
			System.out.println("초록색");
			break;
		default : 					// 위에 모든 case들이 해당되지 않을 때
			System.out.println("잘못 입력하였습니다.");
		}
		*/
		// => 위에 조건문을 if문으로 작성한다면...
		if (color == 1) {
			System.out.println("빨간색");
		} else if (color == 2) {
			System.out.println("파란색");
		} else if (color == 3) {
			System.out.println("초록색");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
	public static void method2() {
		/*
		 * * 과일을 구매하는 프로그램 *
		 * 사용자가 구매하고자 하는 과일을 입력하면, 해당가격을 출력
		 * 
		 * 출력형식 => {과일이름}의 가격은 {과일가격}원 입니다.
		 * 
		 * --------------------
		 * 사과 : 15000원
		 * 포도 : 30000원
		 * 귤 : 8000원
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구매할 과일을 입력하시오.");
		System.out.print(" : ");
		String fruit = sc.next();
		
		int price = 0;
		
		switch (fruit) {
			case "사과" : 			// fruit == "사과"
				price = 15000;
				System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
				break;
			case "포도" : 			// fruit == "포도"
				price = 30000;
				System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
				break;
			case "귤" : 				// fruit == "귤"
				price = 8000;
				System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
				break;
			default : 				// 위에 모든 case들이 해당되지 않을 때
				System.out.println("없는 과일입니다.");
		}
	}
	public static void method3() {
		/* TODO:
		 * "월"을 입력받아 해당 월의 말일이 며칠까지인지 출력
		 * 
		 * 월을 입력하세요: xx
		 * => 출력 : xx월은 xx일까지입니다.
		 * 
		 * 1,3,5,7,8,10,12 => 31
		 * 4,6,9,11 => 30
		 * 2 => 28
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
// =>		case 1,3,5,7,8,10,12 :			// JDK14 버전부터 적용가능하다.
			System.out.println(month + "월은 31일까지 입니다.");
			break;
		case 4,6,9,11 : 
			System.out.println(month + "월은 30일까지 입니다.");
			break;
		case 2 : 
			System.out.println(month + "월은 28일까지 입니다.");
			break;
		default : 
			System.out.println("잘못 입력하였습니다.");
		}
		
		
	}

}

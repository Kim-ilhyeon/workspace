package com.kh;

import java.util.Scanner;	// class선언문 위에 작성해야됨!!

public class VariablePractice1 {
	public static void main(String[] args) {
		
		/*
		 * 실습문제 1
		 * 이름, 성별, 나이, 키를 사용자에게 입력받아
		 * 각각의 값을 변수에 담고 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);	// Scanner 생성
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요.(남/여) : ");
		String gender = sc.nextLine();
		// 문자타입(char)으로 사용하고자 할 경우,
		// 		.charAt(인덱스 값) : 문자열 인덱스 위치의 한 문자를 반환.
		// ex) "apple".charAt(3) -> 'l'을 반환
		char gen = gender.charAt(0);
		
		// 나이 -> 딱 떨어지는 수 : 정수형 int
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//zl -> 소숫점이 포함되어 있는 수 : 실수형 double
		System.out.print("키를 입력하세요.(cm) : ");
		double cm = sc.nextDouble();	
		
		System.out.println("------------pintln문-----------");
		System.out.println("키 " + cm + "cm인" + age + "살 " + gender + "자" + name + "님 반갑습니다.");
		System.out.println("키 " + cm + "cm인" + age + "살 " + gen + "자" + name + "님 반갑습니다.");		
		System.out.println("------------printf문-----------");
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다.^^\n", cm, age, gender, name);
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다.^^\n", cm, age, gen, name);
		
		
		
	}
}

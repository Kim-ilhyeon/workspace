package com.kh;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
		
		System.out.print("문자를 입력해주세요 : ");	// "문자를 입력해주세요 : " 내용을 콘솔창에 출력
		String input = cs.nextLine();		// 문자열을 입력받아 in이라는 변수에 저장
		
		// 문자열변수 input에 저장된 값 중 첫번째 위치(인덱스 값)의 글자를 추출
		char ch = input.charAt(0);
		
		// 문자를 정수로 자료형 변환
		int unicode = (int)ch;
		
		System.out.println("------println문--------");
		System.out.println(ch + " unicode : " + unicode);
		System.out.println("------printf문--------");
		System.out.printf("%c unicode : %d\n", ch, unicode);

	}

}

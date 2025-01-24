package com.kh;

import java.util.Scanner;

public class VariablePractice4 {
		public static void main(String[] args) {
			
			/*
			 * 실습문제 4
			 * 영어 문자열 값을 키보드로 입력받아 문자에서 앞에서 세개를 출력하세요.
			 */
			
			Scanner cs = new Scanner(System.in);
			
			System.out.print("문자열을 입력하세요 : ");
			String input = cs.nextLine();
			
			char ch1 = input.charAt(0);
			char ch2 = input.charAt(1);
			char ch3 = input.charAt(2);
			
			System.out.println("---------println문-----------");
			System.out.println("첫번째 문자열 : " + ch1);
			System.out.println("두번째 문자열 : " + ch2);
			System.out.println("세번째 문자열 : " + ch3);
			System.out.println("---------printf문-----------");
			System.out.printf("첫번째 문자열 : %s\n두번째 문자열 : %s\n세번째 문자열 : %s\n", ch1, ch2, ch3);
			
			
			
			
			
		}
}

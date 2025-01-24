package com.kh;

import java.util.Scanner;

public class VariablePractice2 {
		public static void main(String[] args) {
			
			/*
			 * 실습문제 2
			 * 키보드로 정수 두 개를 입력받아 두 수의
			 * 합, 차, 곱, 나누기한 몫을 출력하세요.
			 */
			Scanner sc = new Scanner(System.in);	// Scanner 생성
			System.out.print("첫번째 정수를 입력해주세요 : ");
			int fstInt = sc.nextInt();
			
			System.out.print("두번째 정수를 입력해주세요 : ");
			int secendInt = sc.nextInt();
			
			int plus = fstInt + secendInt;
			
			int minus = fstInt - secendInt;
			
			int xx = fstInt * secendInt;
			
			int nanugi = fstInt / secendInt;
			
			System.out.println("------------println문----------");
			System.out.println("더하기 결과 : " + plus);
			System.out.println("빼기 결과 : " + minus);
			System.out.println("곱하기 결과 : " + xx);
			System.out.println("나누기 결과 : " + nanugi);
			System.out.println("------------printf문----------");
			System.out.printf("더하기 결과 : %d\n빼기결과 : %d\n곱하기 결과 : %d\n나누기 결과 : %d\n", plus, minus, xx, nanugi);
		}
}

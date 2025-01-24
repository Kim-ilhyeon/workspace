package com.kh;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		/*
		 * 실습문제 2
		 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점의 평균을 출력하세요
		 * 이 때 총점과 평균은 정수형으로 처리하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		double ko = sc.nextDouble();
		
		System.out.print("영어 점수를 입력하세요 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 점수를 입력하세요 : ");
		double math = sc.nextDouble();
		
		int total = (int)(ko + eng + math);
		int total2 = (int)ko + (int)eng + (int)math;
		
		int average = total / 3;
		
		System.out.println("-------println문---------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.println("-------printf문---------");
		System.out.printf("총점 : %d\n평균 : %d", total, average);
		
		
	}

}

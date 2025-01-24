package com.kh;

import java.util.Scanner;

public class VariablePractice3 {
		public static void main(String[] args) {
			
			/*
			 * 실습문제 3
			 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요.
			 * 계산공식) 면적 : 가로 * 세로
			 * 			둘레 : (가로 + 세로) * 2
			 */
			Scanner sc = new Scanner(System.in);
			
			System.out.print("가로 길이를 입력해주세요. : ");
			double width = sc.nextDouble();
			System.out.print("세로 길이를 입력해주세요. : ");
			double height = sc.nextDouble();
			
			double myenjuk = width * height;
			double dullea = (width + height) * 2;
			/*
			System.out.println("----------println문--------");
			System.out.println("면적 : " + myenjuk);
			System.out.println("둘레 : " + dullea);
			*/		// 소수점 뒤에 길이를 조절할 수 없어 사용 불가능!!
			System.out.println("----------printf문--------");
			System.out.printf("면적 : %.2f\n둘레 : %.1f\n", myenjuk, dullea);
			
		}
}

	package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
//		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
//		practice9();
//		practice10();
		practice11();
		

	}
	public static void practice1() {
		// 실습문제 1풀이
		// 키보드로 입력받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 :");
		int num = sc.nextInt();
		
		String result = (num >= 1) ? "양수다" : "양수가 아니다";
		
		System.out.println(result);
	}
	// =================================================================
	public static void practice2() {
		// 실습문제 2풀이
		// 키보드로 입력받은 하나의 정수가 양수이면 "양수다",
		// 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 :");
		int num = sc.nextInt();
		
		String result = (num >= 1) ? "양수다" : (num == 0) ? "0이다" : "음수다";
		System.out.println(result);
	}
	public static void practice3() {
		// 실습문제 3풀이
		// 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 :");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(result);
	}
	public static void practice4() {
		// 실습문제 4
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력해주세요 :");
		int num = sc.nextInt();
		
		System.out.print("사탕개수를 입력해주세요 :");
		int candy = sc.nextInt();
		
		int result = (candy / num);
		int resultcd = (candy % num);
		
		System.out.println("-------println문-------");
		System.out.println("1인당 동일하게 사탕을 " + result + "개씩 나누고 남은 사탕의 개수는 " + resultcd + "개 입니다.");
		System.out.println("-------printf문-------");
		System.out.printf("1인당 동일하게 사탕을 %d개씩 나누고 남은 사탕의 개수는 %d개 입니다.\n", result, resultcd);
	}
	public static void practice5() {
		// 실습문제 5
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int cl = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		char gen = gender.charAt(0);
		
		System.out.print("성적(소숫점 아래 둘째자리까지) : ");
		double grades = sc.nextDouble();
		
		String genResult = (gen == 'M') ? "남학생" : "여학생";
		
		System.out.printf("%d학년 %d반 %d번 %s %s 성적은 %.2f이다.\n", grade, cl, num, name, genResult, grades);
	}
	public static void practice6() {
		// 실습문제 6
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age > 13) && (age <= 19) ? "청소년" : "성인";
		
		System.out.println(result);
	}
	
	public static void practice7() {
		// 실습문제 7
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int ko = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();		
		
		System.out.print("수학 점수 : ");
		int ma = sc.nextInt();
		
		int total = ko + eng + ma;
		int average = total / 3;
		
		String result = (average >= 60) && (ko >= 40) && (eng >= 40) && (ma >= 40) ? "합격" : "불합격";
		
		System.out.println(result);
	}
	public static void practice8() {
		// 실습문제 8
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하시오 ");
		System.out.print(" : ");
		String btnum = sc.next();
		
		char birth = btnum.charAt(7);
		
		String result = (birth % 2 == 0) ? "여자" : "남자";
		
		System.out.println(result);
	}
	public static void practice9() {
		// 실습문제 9
		// 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		// 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		// 아니면 false를 출력하세요.
		// (단, num1은 num2보다 작아야 함)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("또 다른 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 < num2) && (num3 <= num1) || (num1 < num2) && (num3 > num2) ? "true" : "false";
		
		System.out.println(result);
	}
	
	public static void practice10() {
		// 실습문제 10
		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("숫자3 입력 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2) && (num2 == num3) ? "true" : "false";
		
		System.out.println(result);
	}
	public static void practice11() {
		// 실습문제 11
		// A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		// 인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		// (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int payA = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int payB = sc.nextInt();		
		
		System.out.print("C사원의 연봉 : ");
		int payC = sc.nextInt();
		
		
		double incenA = (payA * 0.4);
		
		double incenB = (payB * 0);
		
		double incenC = (payC * 1.15);
		
		
		double incenpayA = payA + incenA;
		double incenpayB = payB + incenB;
		
		String resultA = (incenpayA >= 3000) ? "3000이상" : "3000미만";
		String resultB = (incenpayB >= 3000) ? "3000이상" : "3000미만";
		String resultC = (incenC >= 3000) ? "3000이상" : "3000미만";
		
		System.out.println("A사원의 연봉/연봉+a : " + payA + " / " + incenpayA);
		System.out.println(resultA);

		System.out.println("B사원의 연봉/연봉+a : " + payB + " / " + incenpayB);
		System.out.println(resultB);
		
		System.out.printf("C사원의 연봉/연봉+a : %d / %.13f\n", payC, incenC);
		System.out.println(resultC);
		
	}
	
}

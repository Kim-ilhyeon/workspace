package com.kh.controllpractice;

import java.util.Scanner;

public class ControlPractice {

	public static void main(String[] args) {
//		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
		practice9();

	}
	
	public static void practice1(){
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		// 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴번호를 입력하세요 : ");
		int select = sc.nextInt();
		
		switch(select) {
			case 1:	
				System.out.println("입력 메뉴입니다.");
				break;
			case 2: 
				System.out.println("수정 메뉴입니다.");
				break;
			case 3: 
				System.out.println("조회 메뉴입니다.");
				break;
			case 4: 
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7: 
				System.out.println("프로그램이 종료됩니다.");	
				break;
			default : 
				System.out.println("없는 메뉴입니다.");					
		}
	}

	
	public static void practice2() {
		// 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		// 짝수가 아니면 “홀수다“를 출력하세요.
		// 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 ==0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	
	public static void practice3() {
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		// (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		// 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		// 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int ma = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		
		int total = ko + eng + ma;
		int average = total / 3;
		
		if ((total >= 40) && (average >= 60)) {
			System.out.printf("국어 : %d \n수학 : %d \n영어 : %d \n합계: %d \n평균 : %d \n축하합니다, 합격입니다!", 
													ko, ma, eng, total, average);
		} else {
			System.out.println("불합격입니다ㅠㅠ");
		}
	}
	public static void practice4() {
		// 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
			case 1: case 2: case 12 : 
				System.out.println(month + "월은 겨울입니다.");
				break;
			case 3: case 4: case 5 :
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6: case 7: case 8 :
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			default : 
				System.out.println("해당하는 계절이 없습니다.");
		}
	}
	
	
	public static void practice5() {
		// 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		// 로그인 성공 시 “로그인 성공”,
		// 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		// 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요
		
		final String id = "myId";
		final String pwd = "myPassword12";

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		
		System.out.print("비밀번호 : ");
		String userPwd = sc.next();
		String result;
		
		// 문자열 비교 메소드 : 문자열.equals(변수 or "문자열 값") => true / false
		if (userId.equals(id) && userPwd.equals(pwd)) {
			result ="로그인 성공";
			System.out.println(result);
			
		} else {
			if (!userPwd.equals(pwd)) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else if (!userId.equals(id)) {
				System.out.println("아이디가 틀렸습니다.");
			}
		}
	}
	
	
	public static void practice6() {
		// 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		/// 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		// 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		// 비회원은 게시글 조회만 가능합니다
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rank = sc.next();
		
		switch (rank) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원" :
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default : 
			System.out.println("없는 등급입니다.");
		}
	}
	
	
	public static void practice7() {
		// 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		// 저체중/정상체중/과체중/비만을 출력하세요.
		// BMI = 몸무게 / (키(m) * 키(m))
		// BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		// BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		// BMI가 30이상일 경우 고도 비만
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double key = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (key * key);
		String result;
		
		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println("BMI지수 : " + bmi);
		System.out.println(result);
	}
	
	
	public static void practice8() {
		// 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		// (단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
		// “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String str = sc.next();
		char ch = str.charAt(0);
		
		if (num1 > 0 && num2 > 0) {
			switch (ch) {
				case '+': 
					System.out.println(num1 + num2);
					break;
				case '-':
					System.out.println(num1 - num2);
					break;
				case '*':
					System.out.println(num1 * num2);
					break;
				case '/':
					System.out.println(num1 / num2);
					break;
				case '%':
					System.out.println(num1 % num2);
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		} else {
			System.out.println("양수를 입력하십시오");
		}
		
		
		
	}
	public static void practice9() {
		// 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		// 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		// 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 :");
		int middle = sc.nextInt();
		System.out.print("기말 고사 점수 :");
		int kimal = sc.nextInt();
		System.out.print("과제 점수 :");
		int gwajea = sc.nextInt();
		System.out.print("출석 횟수 :");
		int cullsuk = sc.nextInt();
				
		int middleK = (int)((double)middle * 0.2);
		int kimalK = (int)((double)kimal * 0.3);
		int gwajeaK = (int)((double)gwajea * 0.3);
		int cullsukK = (int)(((double)cullsuk / 0.2) * 0.2);
		
		int result = middleK + kimalK + gwajeaK + cullsukK;
		
		System.out.println("중간 고사 점수(20) : " + middleK);
		System.out.println("기말 고사 점수(30) : " + kimalK);
		System.out.println("과제 점수(30) : " + gwajeaK);
		System.out.println("출석 점수(20) : " + cullsukK);
		System.out.println("총점 : " + result);

		System.out.println("===========결과===========");
		
		if (result >= 70) {
			System.out.println("PASS");
		} else {
			if (cullsuk / 20 * 100 < 30) {
				System.out.println("Fail [출석 횟수 부족 (" + cullsuk + "/20)]");				
			} else if (result < 70) {
				System.out.println("Fail [점수미달]");
			}
		}
		
		
		
		
		
		
		
	}
	public static void practice10(){
		Scanner sc = new Scanner(System.in);
		
	}
	

}

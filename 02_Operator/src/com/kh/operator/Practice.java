package com.kh.operator;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
//		example01();	
//		example02();
		example03();
		

	}
	public static void example03() {
		/*
		 * 산술 연산자 활용 예제_
		 * 키와 몸무게를 입력받아서 BMI를 계산하여 출력
		 * * BMI : 몸무게 / (키(m) * 키(m));
		 * * BMI 판정기준
		 * 	- 18.5 이하 : 저체중
		 * 	- 18.5 < BMI <= 22.9 : 정상
		 * 	- 23.0 <= BMI <= 24.9 : 과체중
		 * 	- 25 <= BMI : 비만
		 * 
		 * 출력 예) "BMI 지수는 20.5로 정상입니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력(cm) : ");
		double cm = sc.nextDouble();
		// 키를 cm에서 m으로 변경
		double m = cm / 100.0;
		// => cm *= 0.01 또는 cm /= 100
		
		System.out.print("몸무게 입력(kg) : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		
		String result = (bmi <= 18.5) ? "저체중" : (bmi > 18.5) && (bmi <= 22.9) ? "정상" : (bmi >= 23.0) && (bmi <= 24.9) ? "과체중" :  "비만";
				System.out.printf("BMI 지수는 %.1f로 %s입니다.\n", bmi, result);
		
		
		
	}
	
	/*
	 * [2] 비교연산자, 논리 연산자
	 * 		: 결과 값이 참(true) 또는 거짓(false)
	 * 		: 이항 연산자
	 */
	public static void example02() {
		/*
		 * 나이를 입력받아 초등학생, 중학생, 고등학생인지 구분하여 출력
		 * (+ 그외에는 "알수없음")
		 * 	- 초등학생	: 8살 ~ 13살
		 * 	- 중학생	: 14살 ~ 16살
		 * 	- 고등학생	: 17살 ~ 19살
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 :");
		int age = sc.nextInt();
		/*
		String result = (age >= 8) && (age <=13) ? "초등학생" : (age >= 14) && (age <=16) ? "중학생" : (age >= 17) && (age <= 19) ? "고등학생" : "알 수 없음";
		*/
		String result = "알 수 없음";		// "알 수 없음" 값으로 초기화
		result = age >= 8 && age <= 13 ? "초등학생" : result;
		// => 초등학생인지 확인

		result = age >= 14 && age <= 16 ? "중학생" : result;
		// => 중학생인지 확인
		
		result = age >= 17 && age <= 19 ? "고등학생" : result;
		// => 고등학생인지 확인
		
		System.out.println(result);
		
		// -----------------------------------------------------------------------
		// SCE => && || 연산자가 수행될 때 두항을 모두 실행하지 않더라도
		//				결과를 알 수 있는 경우 뒤쪽 연산을 수행하지 않는다.
		// * && : 앞의 조건이 false일 때 뒤의 조건이 수행x
		// * || : 앞의 조건이 true일 때 뒤에 조건이 수행x
		int num = 10;
		int i = 3;
		boolean result2;
		
		result2 = ((num +=15) < 0) && ((i *= 2) > 2);
		System.out.println("=======&& 연산결과========");
		System.out.println("result2 :" + result2);
		System.out.println("i : " + i);
		System.out.println("num : " + num);
		// => result2: false, i: 3, num: 25
		
		result2 = ((num += 15) < 0) || ((i *= 2) >2);
		System.out.println("=======|| 연산결과========");
		System.out.println("result2 :" + result2);
		System.out.println("i : " + i);
		System.out.println("num : " + num);
		// => result2: true, i: 6, num: 40
		
		

	}
	
	/*
	 * [1] 복합 대입 연산자
	 * 		: 대입 연산자와 다른 연산자를 조합해서 하나의 연산자 처럼 사용되는 연산자
	 * 
	 * 		n1 += 10;
	 * 		=> n1 = n1 + 10;
	 */
	public static void example01() {
		/*
		 * 사용자로부터 숫자를 입력 받아서 그 값에 7L(long)을 더한 결과를 출력
		 * => 숫자를 입력 받을 때 타입을 short 자료형 사용 (.nextShort)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 :");
		short sh = sc.nextShort();
		
		sh += 7L;
		// => 복합 대입 연산자를 사용하지 않은 경우
		// sh = (short)(sh + (short)7L);
		// sh (short) + 7L (long)
		
		System.out.println("입력된 값에 7L을 더한 값은 " + sh + "입니다.");
	}
}

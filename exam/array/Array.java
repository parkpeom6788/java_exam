package array;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		// Array이란?
		// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		// 배열 선언 :: int[] arr;
		// int[] arr = new int[5];
		// int[] arr = {1,2,3,4,5};
		// -> 길이가 5인 배열이 생성
		
		// arr[0] = 1 , arr[1] = 2 , arr[2] = 3, arr[3] = 4 , arr[4] = 5
		// "마지막 번호는 길이-1"
		
		// 배열을 사용하는 이유 ?
		// 여러개의 같은 타입 데이터를 한번에 선언이 가능
		// 연속적으로 사용이 가능 ( 제어문으로 사용이 가능 )
		String[] strArr1 = {"딸기","복숭아","키위","사과","바나나"};
//		strArr1[0] 자리에 "딸기";
//		strArr1[1] 자리에 "복숭아";
//		strArr1[2] 자리에 "키위";
//		strArr1[3] 자리에 "사과";
//		strArr1[4] 자리에 "바나나";
		System.out.println(strArr1[4]); // 바나나
		for(int i=0; i<strArr1.length; i++) {
			System.out.println(strArr1[i]);
		}
		// array 배열을 이용하여 배열안에, 과목별 점수를 저장하고 
		// 총합계와 평균까지 구해 출력하는 프로그램을 만들어보자.
		Scanner sc = new Scanner(System.in);
		int[] strScore = new int[4]; // 4칸의 메모리공간을 만듬 값은 할당되지 않음
		float avr = 0;
		System.out.println("===================================");
		System.out.println("입력");
		System.out.printf("국어 점수 : ");
		strScore[0] = sc.nextInt();
		System.out.printf("영어어 점수 : ");
		strScore[1] = sc.nextInt();
		System.out.printf("수학 점수 : ");
		strScore[2] = sc.nextInt();
		
		strScore[3] = strScore[0] + strScore[1] + strScore[2];
		System.out.println("===================================");
		System.out.println("출력");
		System.out.println("국어 : " + strScore[0]);
		System.out.println("영어 : " + strScore[1]);
		System.out.println("수학 : " + strScore[2]);
		System.out.println("합계 : " + strScore[3]);
		
		avr = (float)strScore[3] / 3;
		System.out.printf("평균 : %.2f \n", avr);
		System.out.println("평균 " + (strScore[3] / 3.0));
	}
}
package java_exam2;

import java.util.Scanner;

public class while문 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("hi");
		}
		System.out.println("-------------------");
		int i = 1;
		while(i <= 5) {
			System.out.println("hi");
			i++;
		}
		System.out.println("-------------------");
		int i2 = 1; do {
			System.out.println("hi");
			i2++;
		} while(i2<=5);
		// 정수값 5개를 입력 받아 입력한 5개의 정수 합 구하기
//		Scanner sc = new Scanner(System.in);
//		int i3 = 1;
//		int total = 1;
//		do {
//			System.out.print("정수 : " );
//			total += sc.nextInt();
//			i3++;
//		}while(i3 <= 5);
//		System.out.println("총합 : " + total );
//		while문을 이용하여 1~100가지의 수 중에 짝수들의 합을 출력
//		짝수들의 합은 : 2550
		int flag = 0 ;
		int jjak = 0;
		for(int i3 = 1; i3<=100; i3++) {
			if(flag == 0) {
				flag = 1;
			} else if(flag == 1){
				jjak += i3;
				flag = 0;
			}
		}
		System.out.println("1 ~ 100 까지의 합 " + jjak);
		
//		그림와 같은 출력결과 만들기 
//		==================Console==================
//		n의 수를 입력 : 200
//		짝수들의 합은 : 10100
//		==================Console==================
		Scanner sc = new Scanner(System.in);
		System.out.println("==================Console==================");
	int flag2 = 0;
	int jjak2 = 0;
	System.out.print("n의 수를 입력 : ");
	int num = sc.nextInt();
	for(int i4 = 1; i4 <= num; i4++ ) {
		if(flag2 == 1) {
			jjak2 += i4;
			flag2 = 0;
		} else if(flag2 == 0) 
			flag2 = 1;	
		}
	System.out.println("짝수들의 합은 : " + jjak2);
	}
}

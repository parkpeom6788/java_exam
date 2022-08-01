package ex05method;

import java.util.Scanner;

public class E05MethodType04_1 {
	
	public static void main(String[] args) {
		
		int sumOfAge = getTotalAge(5);
		System.out.println("입력받은 나의의 합은 ? : " + sumOfAge);
	}
	static int getTotalAge(int parsonCnt) {
		Scanner sc = new Scanner(System.in);
		int sumAge = 0;
		// 입력받은 사람의 수만큼 반복하면서 나이를 입력받음
		for(int i = 1; i <= parsonCnt; i++) {
			System.out.print(i + "번째 사람의 나이 : ");
			int age = sc.nextInt();
			sumAge += age;
		}
		return sumAge;
	}
}

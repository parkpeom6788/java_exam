package 두숫자덧셈뼬겜곱셉나눗셈나머지;

import java.util.Scanner;

public class TestMethod {
	
	public static void arithmetic(int num1,int num2) {
		System.out.println("덧셈 결과 -> " + (num1 + num2));
		System.out.println("뺼셈 결과 -> " + (num1 - num2));
		System.out.println("곱셈 결과 -> " + (num1 * num2));
		System.out.println("나눗셈 몫 결과 -> " + (num1 / num2));
		System.out.println("나눗셈 나머지 결과 -> " + (num1 % num2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		arithmetic(num1,num2);
	}
}

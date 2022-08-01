package ex05method;

import java.util.Scanner;

/* 메소드 규칙
 *  java 에서 main 메소드는 무조건 publis static void 로 선언하기로 약속 되었다
 *  static 으로 선언되 메소드는 static 으로 선언된 메소드만 호출할수 있다.
 *  메소드 호출 후 반환된 값은 항상 호출한 위치로 반환된다. 이때 메소드는
 *  메모리에서 소멸된다.
 *  반환값이 없는 void 형 메소드도 실행이 완료되면 호출한 위치로 실행의 흐름이 돌아온다.
 */
public class E01MethodBasic {
	public static int simpleFunc(int a,int b) {
		int sum = a + b;
		return sum;
	}
	public static void menuPrint() {
		System.out.println("당신의 이름은 무엇인가요?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		namePrint(name);
	}
	public static void namePrint(String n) {
		System.out.println(" 제 이름은 " + n +"입니다.");
	}
	public static void main(String[] args) {
		/*
			메소드 정의 1 : 반환타입0 , 매개변수0 , 형태로 정의
			-> 두개의 정수를 전달받아 합의 결과를 반환한다.
		 */
		int result = simpleFunc(1, 2);
		System.out.println("1과 2를 전달한 결과 : " + result);
		System.out.println("10과 20을 전달한 결과 : " + simpleFunc(10, 20));
		menuPrint();
	}
}

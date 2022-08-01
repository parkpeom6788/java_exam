package ex05method;

public class E02MethodType01 {
	
	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1. 열기 2. 계속하기 3. 종료");
		System.out.println("=====================");
	}
	static void noParamNoRetrun2() {
		
	}
	static void noParamNoRetrun2(int a) {
		// 동일한 이름의 함수가 정의되어 있으나 매개변수의 개수로
		// 구분 가능하므로 다른 함수임
	}
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return문 이전]");
		return;
//		if(returnValue % 2 == 0) {
//			System.out.println(returnValue + "는 짝수");
//		}
//		System.out.println(returnValue + "는 홀수");
//		System.out.println("[return문 이후]");
	}
	public static void main(String[] args) {
		noParamNoReturn();
		noParamNoRetrun2();
		noParamNoReturn3();
	}
}

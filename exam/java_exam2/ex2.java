package java_exam2;

import java.io.IOException;

public class ex2 {
	
	public static void main(String[] args) throws IOException {
		
		// 사용자에게 값을 입력받은 후 그 값이 숫자인지 아닌지를 출력하는 프로그램 만드시오
		// 아스키 코드 값은 48 ~ 57 이다.
		int number = System.in.read();
		System.out.println(number >= 48 && number <= 57 ?  "숫자입니다"  :  "숫자가 아닙니다" );
		
	}
}

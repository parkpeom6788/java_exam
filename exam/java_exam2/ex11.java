package java_exam2;

import java.io.IOException;

public class ex11 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("숫자 입력 : ");
		int number = System.in.read();
		// 0 은 아스키코드  48부터 ! 
		if(number >= 48 && number <= 57) {
			if(number % 2 == 0) {
				System.out.println("2의 배수입니다.");
			} else {
				System.out.println("2의 배수가 아닙니다.");
			}
		} else {
			System.out.println("숫자가 아닙니다.");
		}
	}
}

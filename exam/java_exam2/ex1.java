package java_exam2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) throws IOException {
		
		int user;
		
		System.out.printf("문자 하나를 입력하세요 : ");
		
		user = System.in.read();
		
		if(user >= 48 && user <= 57) { // 0 ~ 10
			if(user % 2 == 0) {
				System.out.println(" 2의 배수입니다.");
			} else if(user % 2 != 0) {
				System.out.println("2의 배수가 아닙니다.");
			}
		} else {
			System.out.println("숫자가 아닙니다");
		}
	}
}

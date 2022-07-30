package java_exam;

import java.util.Scanner;

public class SwitchTest {
	
	public static void main(String[] args) {
		int jumsu = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 숫자를 입력하세요 : ");
		jumsu = scanner.nextInt();
		System.out.println("점수 : " + jumsu);
		scanner.close(); // scanner 닫기 
		char grade='0';
		switch(jumsu / 10) { // 몫을 받기 
		
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			grade = 'F';
			break;
		default :
			System.out.println("잘못된 점수 입력 입니다.");
		}
		System.out.println("입력된 점수 " + jumsu + "점은 " + grade + "학점 입니다.");
	}
}

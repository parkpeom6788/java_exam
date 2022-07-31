package random;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num1 = r.nextInt(3) + 1; // 1 ~ 3 
		String str1 = "";
		String str2 = "";
		
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.println("숫자를 선택하세요 (1.가위/ 2.바위 / 3. 보) : ");
		int num2 = sc.nextInt();
		
		System.out.println("========결과========");
		
		switch(num1)  {
		case 1:
			str1 = "가위";
			break;
		case 2:
			str1 = "바위";
			break;
		case 3:
			str1 = "보";
		}
		switch(num2) {
		case 1:	
			str2 = "가위";
			break;
		case 2:
			str2 = "바위";
			break;
		case 3:
			str2 = "보";
			break;
		}
		System.out.printf("당신은 %s를 냈습니다. \n ", str2);
		System.out.printf("컴퓨터는 %s를 냈습니다. \n", str1);
		System.out.println("=======================");
		
		if(num1 == num2) {
			System.out.println("비겼습니다.");
		} else if((num1 == 3 && num2 == 1) || (num1 == 2 && num2 == 3) || (num1 == 1 && num2 == 2 ))  {
			System.out.println("당신이 이겼습니다.");
		} else {
			System.out.println("당신은 졌습니다.");
		}
	}
}

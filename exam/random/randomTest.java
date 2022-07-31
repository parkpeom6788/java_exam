package random;

import java.util.Random;
import java.util.Scanner;

public class randomTest {
	
	/*
		Random 이란 ?
		자바에서 난수를 생성하는 방법으로 
		Random r = new Random(); // 랜덤 객체 생성
		int i = r.nextInt(숫자); // i에 랜덤 숫자 대입 
		
		r.nextInt(숫자); 에서 숫자에 들어가는 수를 5라고 하면 
		0부터 4까지 총 5개의 정수가 랜덤으로 뽑힌다
		
		★ 가독성 좋게 r.nextInt(숫자) + 1; 로 하여 1부터 내가 max값으로 지정하고 싶은 수까지
		랜덤으로 뽑히게끔 만들어 사용한다.
	 */
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100);    // 0 ~ 99 
		int num1 = r.nextInt(9) + 1; // 1 ~ 9
		System.out.println(num1);
		
		Random r2 = new Random();
		
		int num2 = r.nextInt(16) + 20; // 20 ~ 35
		System.out.println("랜덤 수 : " + num2);
		
		// 2.0 또는 1범위의 랜덤 수 추출
		int num3 = r.nextInt(2); // 0 ~ 1
		System.out.println("랜덤 수 : " + num3);
		/*
		동전 앞/뒤 맞추기 예제
		 ==================Console================== 

		==========동전 앞/뒤 맞추기==========

		숫자를 입력해주세요 (1.앞면/ 2.뒷면) : 1

		정답!

		 ==================Console================== 
		 */
		
		System.out.print("숫자를 입력해주세요 (1.앞면/2.뒷면) : ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		Random r3 = new Random();
		int random= r3.nextInt(2)+1; // 1부터 2개 1,2
		
		if(random == answer) {
			System.out.println("정답!");
		} else {
			System.out.println("틀렸습니다");
		}
		System.out.println("상대방 답 : " + random);
		System.out.println("내 답 : " + answer);
		
		/*
		가위바위 보 게임
		==================Console==================  
		=== 가위 바위 보 게임 === 
		숫자를 선택하세요 (1.가위/2.바위/3.보) : 1
		 ======== 결과 ========= 

		당신은 가위를 냈습니다. 
		컴퓨터는 보를 냈습니다. 

		====================== 
		당신이 이겼습니다.ㅠ.ㅠ
		 ==================Console================== 
		*/
		Random r4 = new Random();
		Random r5 = new Random();
		int computer = r5.nextInt(3)+1;
		System.out.println("====================Console===================");
		System.out.println("===가위 바위 보 게임===");
		System.out.print("숫자를 선택하세요 (1.가위/2.바위/3.보): ");
		int answer2 = sc.nextInt();
		// 1 - 2 짐  1 - 3 이김 
		// 2 - 1 이김 2 - 3 짐
		// 3 - 1 짐 3 - 2 이김 
		System.out.println("======결과======");
		if(answer2 == 1 && computer == 2) {
			System.out.println("졌습니다.");
		} if (answer2 == 1 && computer == 3 ) {
			System.out.println("이겼습니다.");
		} if (answer2 == 2 && computer == 1 ){
			System.out.println("이겼습니다.");
		} if(answer2 == 2 && computer == 3 ) {
			System.out.println("졌습니다.");
		} if(answer2 == 3 && computer == 1 ) {
			System.out.println("졌습니다.");
		} if(answer2 == 3 && computer == 2 ) {
			System.out.println("이겼습니다.");
		} else if(answer2 == computer) {
			System.out.println("비겼습니다.");
		}
	}
}

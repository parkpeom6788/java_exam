package random;

import java.util.Random;
import java.util.Scanner;

public class UpGame2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		Random r = new Random(); 
		boolean bool = true; 
		int count = 0; // 변수선언을 여기서 해줘야 2.GameScore에서 사용할수있음 
		int record = 100; 
		while (bool) { 
		System.out.println(" === Up & Down Game === "); 
		System.out.println("1. GameStart"); 
		System.out.println("2. GameScore"); 
		System.out.println("3. End Game"); 
		System.out.print("선택 > "); 
		int sel = sc.nextInt(); 

		switch (sel) { 
		case 1: 
		// 실제 게임 로직 작성 
		System.out.println("<< Game Start >>"); 
		// 회차용 변수 
		count = 0; // 여기서 count를 초기화 해주지 않으면 한 번 게임이 끝날때 저장됬던 카운드에 연이어서 count++ 가 된다. 
		int cNum = r.nextInt(99) + 1;// 정답번호 
		// ++count , count++ -> count증가 후 명령어 수행, 명령어 수행후 count증가 
		while (true) { 
		System.out.println("<<" + (++count) + "회차 >>"); 
		System.out.print("Input Number : "); 
		int uNum = sc.nextInt(); // 사용자가 입력한 번호 
		if (cNum > uNum) { 
		System.out.println("결과 >> UP "); 
		} else if (cNum < uNum) { 
		System.out.println("결과 >> DOWN"); 
		} else if (cNum == uNum) { 
		System.out.println("정답"); 
		// record는 최고 기록을 나타내는 변수 
		if (record > count) { 
		record = count; 
		} 
		break; 
		} 
		} 
		break; 
		// unreachable code : 이 코드에 도달 못함 
		case 2: 
		System.out.println("<< Game Score >>"); 
		System.out.println("기록 : " + record + "회"); 
		break; 
		case 3: 
		bool = false; 
		break; 
		} 
		} 
		} 
}

package ex04controlerstatement;

import java.util.Scanner;

public class E02Switch {
	/*
	 * switch문
	 * if문 처럼 조건에 따라 분기하는 제어문으로
	 * 정수식의 값과 동일한 부분을 찾아 실행하는 형태
	 * 형식]
	 * switch(정수식 or 산술식) {
	 * 	case 1:
	 * 		실행문 1; break;
	 * case 2:
	 * 		실행문 2; break;
	 * default :
	 * 		위의 값과 매칭되지 않을 때 실행되는 문장
	 * 		else 문과 같은 의미이다
	 * }
	 * - switch문 내부에서 break 문을 만나게 되면 실행이 중지 되고 
	 * 블럭밖으로 탈출하게 된다.
	 */
	public static void main(String[] args) {
		/*Scanner 클래스
		 * 	:JDK5.0에 추가된 클래스로 키보드를 통해 사용자로부터
		 * 값을 입력 받을때 사용함
		 * nextInt() : 정수를 입력받음
		 * nextLine() : 문자열을 입력 받음
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는 : " + iNum);
		
		int remain = iNum % 3;
		
		switch(remain) {
		case 0 :
			System.out.println("나머지는 0 입니다.");
			break; // switch문에서 break 문을 만나면 탈출하게 된다. 해당 블록을 탈출한다 
		case 1:
			System.out.println("나머지는 1 입니다.");
			break;
		default :
			System.out.println("나머지는 2입니다.");
		}
		
		/*
		 * switch 문 사용시 주의사항
		 * Long 타입의 변수는 사용이 불가능
		 * byte/short/int/char/String 만 사용할 수 있다.
		 * 논리식도 사용이 불가능하다
		 */
//		Long Ln = 100L;  Switch 에 Long 사용못함 
//		switch(Ln) {
//		case 100 :
//			System.out.println("Long타입 사용 ?? ");
//		default : 
//			System.out.println("안되겠군");
//		}
//		switch(iNum%3==0) {
//		
//		}
		// 문자열이나 문자는 switch 문에서 사용이 가능하다
		String title = "자바";
		switch(title) {
		case "자바" : System.out.println("자바 좋아");
			break;
		case "JAVA" : System.out.println("JAVA Goooooood");
			break;
		}
		
		/*
		 * 여러가지 case를 동시에 처리할때는 break 문 없이 case 를 나열한다
		 * if문에서 || (논리OR)를 사용한것과 동일하다
		 */
		int season = 4;
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8: case 9:
			System.out.println("여름입니다.");
			break;
		case 10:
			System.out.println("가을입니다.");
			break;
		case 11: case 12: case 1: case 2:
			System.out.println("겨울입니다.");
		}
		/* 조건문중에 하나인 switch 문이다 저는 개인적으로 if문을 더 많이 씁니다.
		 * 명시적으로 코딩할수 있기 떄문이다. 하지만 어떤 경우에는 if문보다 switch문을 쓸때 코드 양이 확 주는 경우가 있다
		 * 그럴 때를 위해 알아두어야 한다 문법은 주석에 달아 놓아야 한다. 
		 * long 타입이 안되는건 첨 알았다.
		 * 
		 */
		
	}
}

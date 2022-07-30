package java_exam2;

public class E05For {
	// for문 : while 문과 같은 반복문의 초기값 , 조건식 , 증감식이
	// 한줄에 있어 반복의 횟수를 명시적으로 알수 있는 반복문이다
	// 그러므로 사용빈도가 가장 높다 
	// 형식 ]
	// for(초기값; 조건식; 증감식;){
	// 실행문장
	// }
	// 실행문장]
	// 초기값 -> 조건식 확인 -> 참일때 실행 -> 증감식 -> 조건식 확인 -> 반복실행 ...
	// -> 조건이 거짓일때 for문 탈출
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}
		
		/*
			시나리오 ] 1 ~ 100 까지의 합을 구하는 프로그램
		 */
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100 까지의 합 : " + sum);
		/*
			시나리오] for문을 이용하여 1 ~ 10 사이의 정수중 2의 배수의 합을 구하는 프로그램
		 */
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("2의 배수 : " + total);
		// if문이나 삼항연산자 없이 구하기
		int total2 = 0;
		for(int i = 0 ; i <= 10; i+=2) { // 증감연산자에 2씩 더하면 됨 
			total2 += i;
		}
		System.out.println("1~10사이 2의 배수의 합(방법2) : " + total);
		
		int a = 1;
		// for문으로 무한루프 조건을 만들때 아래와 같이 사용한다. 
		
		for(;;) { // 무한반복 
			System.out.println("나는 for문으로 만든 무한 루한루프 입니다." + a);
			a++; 
			if(a == 10) break; // 10이 되면 무한반복문을 벗어난다. 
		}
		/*
			for문의 끝에 ; 를 사용하면 반복할 문장이 없는 것으로 간주되어
			for문과 상관없이 한번만 실행한다.
		 */
		for(int j = 1;  j <= 5; j++); { // 마지막에 ; 쓰면 한번만 실행됨 
 			System.out.println("응 실행 안됨");
		}
		
		/*
			for문의 초기식에서 선언된 변수 j 는 for문이 종료되는 순간
			메모리에서 소멸된다. 여기서 사용된 변수 j는 지역변수(Local variable) 라고 한다
			지역변수는 해당 지역을 벗어나면 즉시 소멸되는 특징을 가지고 있다.
			
			System.out.println("위 for문에서 선언한 변수 j = " + j);
		 */
		System.out.println(" 위 main 함수 지역에서 선언한 변수 total = " + total);
		
		/*
		 * for문의 초기값을 외부(넓은 지역) 에서 선언하면 해당 변수는 for문인쪽(좁은지역) 
		 * 에서 사용할 수 있다. 즉 아래에 선언한 변수 i는 main() 함수의 지역변수가 된다.
		 * 
		 */
		int i = 0;
		for(; i<= 5; i++) {  // 밖에다가 선언하고 0 부터 5까지
			System.out.println("for문 안에서의 i값 = " + i);
		}
		System.out.println("for문 밖에서의 i값 = " + i );
		
		/*
			시나리오]  다음의 출력결과를 보이는 for문을 작성하시오
			출력결과 
			0 0 0 1
			0 0 1 0
			0 1 0 0 
			1 0 0 0
			해법 : x 와 y의 값을 더해서 5개 가 될때 1 출력
		 * 
		 */
		String str = "";
		for(int i2 = 1; i2 <= 4; i2++) {
			for(int j2 = 1; j2 <= 4; j2++) {
				str = i2 + j2 == 5 ? "1" : "0";
				System.out.print(str + " ");
			}
			System.out.println();
		}
		// 연습문제 ] 구구단을 출력하는 프로그램 for문을 작성하시오
		
		System.out.println("for문으로 제작한 구구단");
		
		for(int u = 2; i <= 9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%-3d * %-3d = %3d" , u , j , (u*j));
				System.out.printf("     ");
			}
			System.out.println("  ");
		}
		// 감소 연산자를 사용으로 구현 
		for(int x = 1; x <= 4; x++) {
			for(int y = 4; y >= 1; y--) {
				if(x == y) 
					System.out.printf("1");
				else 
					System.out.printf("0 ");
				}
				System.out.println();
			}
		}
}

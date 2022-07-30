package java_exam;

public class loop {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		while(a < 10) {
			a++;
			System.out.println("a="+a);
		}
		
		int b = 0;
		do {
			// 적어도 한번 { } 내 문장 실행
			b++;
			System.out.println("b=" + b);
		}while(b<10); // do 의 식을 적어도 한번 거치고 나서 b의 값이 10보다 작으면 한번더 계속 반복
		
		
		int[] array = new int[3];
		
		int cnt = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <= i; j++) {
				array[j] = cnt++;
				System.out.print(array[j]);
			}
			System.out.println();
		}
		
		// for 문 형식 
		// 초기식을 맨처음 한번 실행 후 조건식으로 이동
		// 조건식을 만족하면  {} 내 문장들을 처리한 후 증감식에 이동함
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("a = " + i );
		}
		
		// 무한반복문 만들기
		// while(true){} , do{} while(true) , for(;;){}
		
		// 기타 제어문 : break , continue 
		// 제어문은 중첩해서 사용할수 있다.
		// 제어문이 중첩되면 수행 후 바깥쪽을 수행한다
		// 반복문의 경우 라벨을 정해주어 break 와 continue 사용
		// break : switch 문이나 반복문을 탈출하는 제어문
		// continue : 반복문에서 이하 문장을 실행하지 않고 다음 반복으로 건너뛰는 제어문
		
		
	}
}

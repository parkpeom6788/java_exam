package ex06array;

public class E05TwoDimArray01 {
	public static void main(String[] args) {
		/*
		아래와 같이 2차원배열을 초기화 하면 세로3 , 가로4인 배열이
		생성된다 초기화할 요소가 없는 부분은 null 로 채워지게된다
		* null : 아무것도 없는 값을 일컫는다. 즉 빈값을 말한다
			스페이스와 같은 공백문자와는 다르다는것을 주의하자
			
		2차원 배열에 대한 코드입니다. 
		2차원 배열이란 세로와 가로로 사각형 모양으로 배열이 생성되는 것을 말합니다.
		 주석에 자세한 형태와 정의를 적어놓았습니다. 
		 arr[][] 형태로 출력 입력 등등을 합니다. 	
		*/
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		/*
			이차원배열에서 "배열명.length" 로 출력하면 세로 크기가 변경된다.
		 */
		System.out.println("배열의 세로크기 : " + arr.length); // 행 크기 
		/*
		 	각 행의 가로 크기는 초기화 된 상태에 따라 다를수 있다
		 	0행은 2 , 2행은 4의 크기를 가지게 된다.
		 */
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d행의 크기 : %d\n", i , arr[i].length);
			System.out.printf("%d행의 출력 : %s\n", i , arr[i]);
		}
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1] = " + arr[0][1]); // 2
		System.out.println("arr[0][3] = " + arr[0][3]); // 범위내에 값이 없음 
		/*
		 * ArrayIndexOutOfBoundsException 예외 발생
		 * 즉 , 배열의 index를 초과했다는 뜻이다.
		 */
	}
}

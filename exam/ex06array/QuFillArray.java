package ex06array;

import java.util.Scanner;

public class QuFillArray {
	
	public static void main(String[] args) {
		//배열의 크기가 10인 변수에 사용자가 입력을 받고 그 배열을 그대로 출력한 후
		//새로운 배열에 짝수는 뒷쪽 인덱스에 홀수는 앞쪽 인덱스에 채워넣으시오.
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(i+1 +"번째 정수를 입력하세요 : " );
			array[i] = sc.nextInt();
		}
		// 짝수는 뒷쪽 인덱스 홀수는 앞쪽 인덱스에 채워놓으세요 
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +"  ");
		}
		System.out.println();
		System.out.println("홀수/짝수 구분 입력 결과");
		// 홀수 짝수 구분입력 결과
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " "); // 짝수
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				System.out.print(array[i] + " "); // 홀수
			}
		}
	}
}

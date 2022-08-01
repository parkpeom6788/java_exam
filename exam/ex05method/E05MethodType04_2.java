package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {
	/*
	시나리오] 여러개의 숫자를 입력받은 후 최대값을 구하는 
	메소드를 정의하시오. 단 숫자의 갯수는 매개변수로 전달받고
	숫자의 갯수만큼 Scanner클래스를 통해 입력받는다.
	입력은 숫자중 최대값을 찾아서 반환하도록 정의한다.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자의 개수 매개변수로 전달받음
		System.out.print("숫자의 개수 : ");
		int count = sc.nextInt();
		inputNumber(count);
	}
	static void inputNumber(int count) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[count];
		for(int i =0; i < count; i++) {
			System.out.print("숫자 입력 : ");
			int cNum = sc.nextInt();
			array[i] = cNum;
		}
		ceilingValue(array);
	}
	// 가장 큰 숫자
	static void ceilingValue(int[] array) {
		int max = array[0]; // 최대값
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			} else if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("가장 큰숫자 : " + max + " 가장 작은 숫자 : " + min);
	}
}

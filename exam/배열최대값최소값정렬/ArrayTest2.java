package 배열최대값최소값정렬;

import java.util.Scanner;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] array = new int[] {23,54,42,54,21};
		int max = array[0]; // 첫번째자리를 지정함! 기준! 
		int min = array[0]; // 첫번째 자리를 지정함! 기준!
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			} else if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("큰수 : " + max);
		System.out.println("작은수 : " + min);
	}
}	

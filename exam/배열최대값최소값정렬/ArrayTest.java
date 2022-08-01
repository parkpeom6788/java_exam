package 배열최대값최소값정렬;

import java.util.Arrays;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5};
		int max = array[0];
		int min =  array[0];
		
		Arrays.sort(array); // 배열 정렬  -> 정렬 시킨다.  최소값 ~ 최대값 
		
		// 최소값
		System.out.println("최소값은 : " + array[0]);
		
		// 최대값
		System.out.println("최대값은 : " + array[array.length - 1]);
		
		
	}
}

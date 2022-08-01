package 배열최대값최소값정렬;

public class 최소값과최대값2 {
	
	public static void main(String[] args) {
		int[] array = new int[] {12,54,67,65,45};
		
		int temp = 0;
		for(int i = 0; i < array.length-1; i++) { // 기준점 
			for(int j = 0; j < array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}
}

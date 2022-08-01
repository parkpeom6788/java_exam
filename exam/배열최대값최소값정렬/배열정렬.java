package 배열최대값최소값정렬;

public class 배열정렬 {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {34,52,23,12,54};
		int temp = 0;
		for(int i = 0; i < array.length - 1; i++ ) { // 4번 비교 
			for(int j = 0; j < array.length - i - 1; j++) { // 4 - i   , 4 .. 3 .. 2 .. 1  버블비교 
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}
}	

package 배열최대값최소값정렬;

public class 최소값과최대값 {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {54,32,12,34,56};
		
		int max = array[0];
		
		for(int i = 0 ; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max = " + max);
		
		// 2번째로 큰수는 ? 
		int temp = 0;
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-i-1; j++) { 
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
		System.out.println("두번째로 큰수  " + array[3]);
	}
}

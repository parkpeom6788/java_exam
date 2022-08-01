package 배열;

public class 오름차순정렬 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10,42,65,3,21};
		int temp = 0;
		for(int i = 0; i < arr.length - 1 ; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}
}

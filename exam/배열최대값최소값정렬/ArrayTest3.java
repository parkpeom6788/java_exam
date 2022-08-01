package 배열최대값최소값정렬;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		
		int[] data = new int[] {54,76,52,21,25,65,98};
		int i , j , temp = 0;
		
		for(i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		// 버블정렬 사용 하여 data 배열의 값을 오름차순으로 정렬한다. 
		// 오름차순 
		for(i = 0; i < data.length-1; i++) {
			for(j = 0; j < data.length - i -1; j++) {
				if(data[j] > data[j+1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j+1] = temp;
				}
			}
		}
		for(i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}

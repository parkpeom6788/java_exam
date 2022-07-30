package java_exam;

public class ex3 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			if(i % 3 == 0) { // 3 
				continue; // 뛰어넘김
			}
			sum += i; //  i = 1 , 2 , 4 
		}
		System.out.println(sum);
	}
}

package 배열;

public class 랜덤2 {
	
	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 100; i++) {
			int number = (int)(Math.random() * 45) + 1;
			System.out.println(number);
		}
	}
}

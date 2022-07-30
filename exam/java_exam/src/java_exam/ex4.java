package java_exam;

public class ex4 {
	
	public static void main(String[] args) {
		
		int total = 0 , x = 0 , y;
		
		while(++x<5) {
			y = x * x;
			System.out.println(y); // 1 
			total += y; // 1 , 4 , 9 , 16 = 30
			 
		}
	}
}

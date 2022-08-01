package star;

public class star {	
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			for(int j=5; j>=i; j--) { // 5 , 4 , 3 , 2 , 1
											  // 5 , 4 , 3 , 2
											  // 5 , 4 , 3 
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

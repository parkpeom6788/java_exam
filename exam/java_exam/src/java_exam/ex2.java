package java_exam;

public class ex2 {
	
	public static void main(String[] args) {
		
		int a = 1 , b = 2;
		
		switch(a++) {
		case 1 : b += 10; // b = 2 + 10 
//		break;
		case 2: b += 5; // 12 + 5 = 17
		}
		System.out.println(b); // 17
		
		
	}
}

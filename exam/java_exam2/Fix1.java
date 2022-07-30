package java_exam2;

public class Fix1 {
	
	public static void main(String[] args) {
		
		int a = 10 , b = 5;
		System.out.println("a = " + a + "\t b = " + b);  // 10 , 5
		++a; 
		--b;
		System.out.println("a = " + a + "\tb = " + b); // 11 , 4 
		a++;
		b--;
		System.out.println("a = " + a + "\tb = " + b); // 12 , 3 
		
		System.out.println("후위 연산 a = " + a++); // 12
		// 명령문이 처리후 증감한 a값 확인
		System.out.println("a 증가 = " + a); // 13
		System.out.println("전위 연산 a = " + ++a); // 14 
		
	}
}

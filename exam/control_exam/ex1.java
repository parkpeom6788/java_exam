package control_exam;

public class ex1 {
	
	public static void main(String[] args) {
		
		// num1의 50을 초기화, num2에 100을 초기화
		// 한 후 큰 수에서 작은 수를 빼는 프로그램을 만드시오.
		int num1 = 50;
		int num2 = 100;
		int result = 0;
		if(num1 > num2) {
		  result = num1 - num2;
		} else {
		  result = num2 - num1;
		}
		System.out.println(result);
		System.out.println(result);
		
//		1부터 100까지 수 중에 3의 배수이거나 7의 배수인 수의 합을
//    구하는 프로그램을 만드시오
//		단, 3과 7의 공배수는 계산되서는 안됩니다.
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if( i % 3 == 0 || i % 7 == 0) {
				// 단 , 3과7의 공배수는 계산하면 안된다.
				if( i % ( 3 * 7)  != 0) {
					total += i;
					System.out.printf("%d + " + i);
				}
			}
		}
		System.out.println("=" + total);
	}
}

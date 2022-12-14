package 소수인지아닌지판별;


// 소수 판별  소수란? 3 , 5 , 7 , 과같이 1과 자기자신만 
public class QuFindPrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		
		if(num == 1) {
			// 1은 소수가 아니므로 무조건 false 반환 
			return false;
		}
		
		else {
			for(int i = 2; i < num; i++) {
				/*
					1과 자기 자신을 제외한 숫자로 나눠서 떨어지면 소수가 아니므로
					그 이후는 검사할 필요가 없다 판단되는 즉시 false를 반환하고 종료한다.
				 */
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		for(int i=1; i<= 100; i++) {
			if(isPrimeNumber(i) == true) { // true 이면 소수이다.
				System.out.println(i);
			}
		}
	}
}

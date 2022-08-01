package 재귀함수;

public class E08RecursiveMethod {
/*
	  재귀함수 (Recursive method)
	  : 하나의 함수에서 자신을 다시 호출하여 작업을 수행하는 방식으로
	  	문제를 해결하는 함수를 말한다
	
		재귀함수를 이용한 팩토리얼 

 		재귀함수는 함수 안에서 자기 자신의 함수를 불러오는 것을 말합니다. 
 		로직이 생각보다 직관적이 못해서 많이 사용하지는 않습니다. 
 		하지만 알고는 있어야 합니다. 무한루프에 빠지지 않는것에
 		 주의하면서 코드를 짜야합니다. 이코드는 매개변수가 1일때 바로 return한다는 코드가
 		  있기 때문에 무한루프로 들어가지 않는것이다.
 */
	public static void main(String[] args) {
		System.out.println("재귀함수를 이용한 팩토리얼 구하기");
		System.out.println("4factorial" + factorial(4));
		System.out.println("10factorial" + factorial(10));
	}
	static int factorial(int number) {
		int result;
		if(number == 1) { // 1이 되면 1리턴 
			result = 1;
		} else {
			// 4  x  3 x  2  x  1 
			result = number * factorial(number-1); // 자기자신 호출
		}
		System.out.println("계산 과정 : number=" + number + ",result = " + result);
		return result;
	}
}

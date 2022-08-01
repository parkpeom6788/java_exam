package ex06array;

public class E07ForEachObject {
	
	public static void main(String[] args) {
		
		// for-each문에 스트링 객체도 할 수 있다는 것을 알기 위해 짠 프로그램입니다.
		String[] strArr = {
			"자바는 재미있다",
			"자바는 유용하다",
			"그러나 어렵다ㅠㅠ"
		};
		for(String e : strArr) {
			System.out.println(e);
		}
		
	}
}

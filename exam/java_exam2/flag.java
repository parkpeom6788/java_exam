package java_exam2;

public class flag {
	
	public static void main(String[] args) {
		
		// flag 로 홀 , 짝
		
		int hol=0 , jjak=0;
		int flag = 0;
		for(int i=0; i<=10; i++) {
			if(flag == 1) {
				jjak += i;
				flag = 0;
			} else if(flag == 0) {
				hol += i;
				flag = 1;
			}
		}
		System.out.println("홀수 합 : " + hol);
		System.out.println("짝수 합 : " + jjak);
	}
}

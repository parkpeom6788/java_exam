package java_exam;

public class ex7 {
	
	public static void main(String[] args) {
		
		String s = "sss";
		System.out.println(s.length()); 
		char[] c = new char[3];
		for(int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
			System.out.print(c[i] + " ");
		}
		System.out.println();
		String s1 = new String("1");
		String s2 = new String("2");
		System.out.println(s1.equals(s2));
		
		System.out.println(new String("자바 프로그래밍 기초").trim().substring(3,8)); // 1부터~7까지
		int[][] array = {{1,2},{1},{3,4,5}};
		
		for(int[] i : array) {
			System.out.println(i.length); // 2 , 1 , 3
		}
		
		// 원소 1.0 , 2.0 , 3.0 을 가지는 double 타입 배열 d를 생성하는 실행문 작성
		double[] d = {1.0,2.0,3.0};
		
		boolean b = 1 == 2; // b = false
		System.out.println("java" + b + '1'); // javafalse1
		
		// 자바에서 다차원 배열은 1차원 배열의 배열이다.
		
		int[][] a = new int[][]{{0},{1,2},{3,4,5}};
		
		int[] array2 = new int[3];

		int cnt = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				array2[j] = cnt++;
				System.out.print(array2[j] + " ");
			}
			System.out.println();
		}
		
		int[] a2 = new int[10];
		for(int i = 0; i < 10; i++) {
			int num = i;
			a2[i] = num * num;
			System.out.println(a2[i]);
		}
	}
}

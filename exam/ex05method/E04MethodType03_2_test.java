package ex05method;

import java.util.Scanner;

public class E04MethodType03_2_test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값 : ");
		int s = sc.nextInt();
		System.out.print("종료값 : ");
		int e = sc.nextInt();
		inputGugudan(s,e);
	}
	static void inputGugudan(int s , int e) {
		for(int i = s; i <= e; i++) {
			for(int j = 1; j<= e; j++) {
				System.out.printf("%-3d * %-3d = %3d" , i , j , (i * j));
				System.out.printf("      ");
			}
			System.out.println("  ");
		}
	}
	public static void tiputGugudan(int s , int e) {
		for( ; s <= e; s++) {
			for(int j = 1; j <= e; j++) {
				System.out.printf("%-3d * %-3d = %3d", s , j , (s * j));
				System.out.printf("       ");
			}
			System.out.println("   ");
		}
	}
}

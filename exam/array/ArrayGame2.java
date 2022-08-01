package array;

import java.util.Scanner;

public class ArrayGame2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] array = new String[10];
		boolean flag = true;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = "비어";
		}
		System.out.println("====모텔 관리 프로그램====");
		while(flag) {
			System.out.println("1.입실\t\t2.퇴실\t\t3.방보기\t\t4.종료");
			System.out.print("선택 > ");
			int rSel = sc.nextInt();
			
			switch(rSel) {
			case 1:
				System.out.print("몇번방에 입실하시겠습니까? > ");
				int choice = sc.nextInt() - 1;
				array[choice] = "손님";
				break;
			case 2:
				System.out.print("몇번방에 퇴실하시겠습니까?");
				choice = sc.nextInt() - 1;
				array[choice] = "비어";
				break;
			case 3:
				for(int i = 0; i < array.length; i++) {
					System.out.println(i+1 +"이 현재 " + array[i]+"있습니다.");
				}
				break;
			case 4:
				System.exit(0); 
			}
		}
	}
}

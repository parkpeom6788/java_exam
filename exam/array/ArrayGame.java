package array;

import java.util.Scanner;

public class ArrayGame {
	
	public static void main(String[] args) {
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String[] room = new String[10];
		
		for(int i = 0; i < room.length; i++) {
			room[i] = "비어"; // 처음에는 다 비어 있다
		}
		
		while(flag) {
			System.out.println("===== 모텔 관리 프로그램 =====");
			System.out.println("1.입실\t\t2.퇴실\t\t3.장보기\t\t4.종료");
			System.out.printf("선택 > ");
			int sel = sc.nextInt();
			
			switch(sel) {
			
			case 1:
				System.out.print("몇번방에 입실하시겠습니까?");
				int rSel = sc.nextInt() - 1; // 1번방 입실이면 배열은 0부터이므로 -1 
				if(room[rSel].equals("비어")) {
					room[rSel] = "손님이";
				} else if(room[rSel].equals("손님이")) {
					System.out.println((rSel + 1) +" 번방이 현재 " + room[rSel] + "있습니다.");
				}
				break;			
			case 2:
				System.out.print("몇번방에서 퇴실하시겠습니까?");
				rSel = sc.nextInt() - 1;
				if(room[rSel].equals("비어")) {
					System.out.println((rSel + 1) + "번방이 현재 " + room[rSel] + "있습니다.");
				} else if(room[rSel].equals("손님이")) {
					room[rSel] = "비어";
				}
				break;
			case 3:
				for(int i = 0; i < 10; i++) {
					System.out.println((i + 1) + "번방이 현재 " + room[i] +"있습니다.");
				}
				break;
			case 4:
				flag = false;
				break;
			}
		}
	}
}

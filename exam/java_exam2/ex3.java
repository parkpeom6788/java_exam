package java_exam2;

import java.util.Scanner;

public class ex3 {
	Scanner sc;
	int korea , eng , math , sum;
	String grade;
	public ex3() {
		sc = new Scanner(System.in);
		korea= setMessage("국어점수 : ");
		eng = setMessage("영어점수 : ");
		math = setMessage("수학점수 :  ");
	}
	public int setMessage(String message) {
		System.out.println(message);
		return  sc.nextInt();
	}
	public String gradeAccount(int korea,int eng,int math) {
		sum = korea + eng + math;
		switch((sum / 3) / 10 ) {
		case 10: case 9:
			grade = "A"; break;
		case 8:
			grade = "B"; break;
		case 7:
			grade = "C"; break;
		case 6:
			grade = "D"; break;
		default :
			grade = "F";
		}
		return grade;
	}
	public void gradeShow() {
		System.out.println("당신의 등급은 " + grade + " 입니다.");
	}
	
	public static void main(String[] args) {
		ex3 ex = new ex3();
		ex.gradeAccount(ex.korea, ex.eng, ex.math);
		ex.gradeShow();
	}
}

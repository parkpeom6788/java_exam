package java_exam;

public class ex8 {
	public static void main(String[] args) {
		PrintArray(new int[] {1,2,3,4});
	}
	public static void PrintArray(int[] n) {
		for(int i=0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}
}

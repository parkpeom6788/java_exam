package java_exam;

public class Unary {
	
	public static void main(String[] args) {
		
		int a = 10 , b = -10;
		boolean c = true , d = false;
		System.out.println("a =  " + a + " \t b= " + b + "\t c=" + c + "\t d = " + d);
		System.out.println("~a= " + ~a);  // 10 -> -10-1 -> -11
		System.out.println("~b=" + ~b); // 10-1 -> 9
		System.out.println("!c=" + (!c) + "\t !d = " + (!d)); // false , true 
		System.out.println("+a="+(+a) + "\t +b = " + (+b)); // 10 , -10 
		System.out.println("-a="+(-a) +"\t -b = " + (-b)); // -10 , 10
	
		
	
	
	}
}

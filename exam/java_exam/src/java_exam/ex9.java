package java_exam;

class Parent {
	int num;
	public void run() {
		System.out.println("1");
	}
}
class Child extends Parent {
	public void run() {
		super.run();
	}
}
public class ex9 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.run();
		
		if(p instanceof Parent) {
			Parent p2 = new Parent();
		}
	}
}

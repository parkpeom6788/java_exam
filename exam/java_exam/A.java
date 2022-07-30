package java_exam;

class Fruit {
	String color;
	
	public Fruit(String color) { // 기본생성자도 항상 만들어두는게 좋다 !! 
		this.color = color;
	}
	public Fruit() {}
	
}
public class A extends Fruit {
	
	double weight;
	
	public A(double weight) {
		this.weight = weight;
	}
}

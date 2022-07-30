package java_exam;

class Car2 {
	public String name;
	protected String color;
	private int model; // private 메서드는 부모 클래스 전용이므로 자식클래스에서 상속되지 않는다
}
class SportsCar extends Car2 {
	boolean turbo;
}

public class ex10 {
	public static void main(String[] args) {
		SportsCar s = new SportsCar();
		
	}
}


package java_exam;

public class Person {
	void name() {}
	protected void number() {}
	void weight() {}
	
	static void show() {}
	private void secret() {}
}
class Student extends Person {
	public void name() {}
    // void number() {} // 부모의 protected 에 접근하지 못한다.
    //static void weight() {} // 자식클래스의 정적메서드는 부모클래스의 인스턴스를 재정의 할수없다
	static void show() {}
	private void secret() {}
	
	// 자식클래스에서 오버라이딩 할수없는 조건으로는
	// final 메서드 , 정적메서드 , private 메서드
}

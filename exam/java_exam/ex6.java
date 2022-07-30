package java_exam;

class Car {
	private String name;
	private String model;
	
	public Car() {}
	
	public Car(String name,String model) {
		this.name = name;
		this.model = model;
	}
	public Car Copy(Car c) {
		return c;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
}
public class ex6 {
	public static void main(String[] args) {
		Car c = new Car("K5","KIA");
		Car c2 = c.Copy(c);
		System.out.println(c2.getModel() + " " + c2.getName());
	}
}

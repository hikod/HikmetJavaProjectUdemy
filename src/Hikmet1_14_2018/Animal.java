package Hikmet1_14_2018;

public abstract class Animal {
	private  String name;

	public Animal(String name) {
		this.name = name;
	}

	public  abstract  void eat();

	public abstract  void breathe();

	public String getName() {
		return name;
	}
	
	public  void test() {
		System.out.println("testing inheritence for static method");
	}

}

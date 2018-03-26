package Hikmet1_15_2018;

abstract public class Araba {
	private int weight;
	private String color;
	private String model;
	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void drive() {
		System.out.println("is driving");
	}
	
	abstract public void mpg();

}

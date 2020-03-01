package chapter3Decorator.Component;

public abstract class Beverage {
	public String description = "Unknown Beverage";
	
	//tall .50, grande 1.00, venti 1.50
	public String size = "Unknown Size";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public double sizeCost() {
		if(size.equals("tall")) return 0.50;
		else if(size.equals("grande")) return 1.00;
		else if(size.equals("venti")) return 1.50;
		else return 0;
	}
	
}

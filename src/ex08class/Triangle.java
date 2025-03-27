package ex08class;

public class Triangle {
	private double bottom;
	private double height;
	
	public Triangle() {
		this.bottom = 0;
		this.height = 0;
	}

	public void init(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	public void setBottom(double bottom) {
		this.bottom = bottom;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return (bottom * height) / 2;
	}
}

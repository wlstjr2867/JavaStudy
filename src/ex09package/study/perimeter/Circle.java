package ex09package.study.perimeter;

public class Circle {
	//원의 둘레를 계산하는 클래스
			
	double rad;
	final double PI;
				
	public Circle(double rad) {
		this.rad = rad;
		PI = 3.14159;
		}
	//둘레 계산
	public double getPerimeter() {
		return 2 * PI * rad;
	}
}


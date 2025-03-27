package ex12inheritance;

class Point {
	int xDot, yDot;

	public Point(int xDot, int yDot) {
		this.xDot = xDot;
		this.yDot = yDot;
	}
	public void showPointInfo() {
        System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
	}
}

class Circle {
	int radian;
	Point center;
	
	public Circle(int radian, int xDot , int yDot) {
		this.radian = radian;//반지름
		this.center = new Point(xDot, yDot);
	}
	
	public void showCircleInfo() {
		System.out.println("반지름:"+ this.radian);
		center.showPointInfo();
	}
}

class Ring extends Circle {
	Circle innerCircle;
	Circle outerCircle;
	
	public Ring(int xDot, int yDot, int radian, int xDot2, int yDot2, int radian2 ) {
		super(radian, xDot, yDot);
		this.innerCircle = new Circle(radian, xDot, yDot);
		this.outerCircle = new Circle(radian2, xDot2, yDot2);
	}

	public void showRingInfo() {
		System.out.println("안쪽원의 정보:");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의 정보:");
		outerCircle.showCircleInfo();
	}
}
public class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
		
	}
}

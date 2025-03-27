package ex08class;

	/*
	기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
	아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
	init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.

	 */
	//public class CalculatorEx {
//		private int operationCount;
//		double add;
//		double min;
//		double mul;
//		double div;
	//	
//		public CalculatorEx(double add, double mul, double min, double div) {
//			this.add = add;
//			this.min = min;
//			this.mul = mul;
//			this.div = div;
//		}
	//	
//		public void showCalculatorEx () {
//			System.out.println("덧셈:"+ add);
//			System.out.println("뺄셈:"+ min);
//			System.out.println("곱셈:"+ mul);
//			System.out.println("나눗셈(몫):"+ div);
//			System.out.println("나눗셈(나머지):"+ div);
//			
//		}
public class Calculator {   
	  
	private int addCount;
	private int minCount;
	private int mulCount;
	private int divCount;

	    
	    public Calculator() {
	        addCount = 0;  
	        minCount = 0;  
	        mulCount = 0;  
	        divCount = 0;  
	    }

		public void init() {
			 addCount = 0;
		     minCount = 0;
		     mulCount = 0;
		     divCount = 0;
		}

		public double add(double a, double b) {
			addCount++;
			return a + b;
		}

		public double min(double a, double b) {
			minCount++;
			return a - b;
		}
		
		public double mul(double a, double b) {
			mulCount++;
			return a * b;
		}
		public double div(double a, double b) {
			if(b==0) {
				System.out.println("0으로 나눌 수 없다.");
				return Double.NaN;
			}
			divCount++;
			return a / b;
		}

		public void showOpCount() {
			System.out.println("덧셈 연산 횟수: " + addCount);
	        System.out.println("뺄셈 연산 횟수: " + minCount);
	        System.out.println("곱셈 연산 횟수: " + mulCount);
	        System.out.println("나눗셈 연산 횟수: " + divCount);
		
	}
}
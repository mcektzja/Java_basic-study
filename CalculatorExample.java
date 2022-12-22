//메소드 공부 08_ 오버로드 연습
//출처: 이것이 자바다(2022)

package Method;

public class CalculatorExample {
	public static void main(String[] args) {
		
	Calculator mycalculator = new Calculator();
	
	double result1 = mycalculator.areaRectangle(10);
//	double result2 = mycalculator.areaRectangle(10, 20);
	
	System.out.println(result1);
//	System.out.println(result2);
	

	}

}

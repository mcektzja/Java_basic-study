//메소드 공부 08_ 오버로드 연습
//출처: 이것이 자바다(2022)

package Method;

public class Calculator {
	
	double areaRectangle(double width) {
		return width * width;
	}
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
package study_practice;

public class MethodTest02 {
			//메소드 공부 02_다중 파라미터 메소드
			//: 주어진 코드를 분석하여 이를 주석으로 달아주세요.
			//출처: 유튜브 홍팍- 메소드와 파라미터
	
	
	// times메소드, a*b출력
	public static void times(double a, double b) {
		System.out.println(a * b);				 // a=2.0, b=2.0 대입  -> 2.0*2.0 출력  = 4.0
												 // a=3.0, b=4.0 대입  -> 3.0*4.0 출력  = 12.0
	}				
	
	// 프로그램의 시작점, times에 대입
	public static void main(String[] args) {

		times(2, 2); 							 // times에 2, 2 대입 
		times(3, 4);							 // times에 3, 4 대입
		
		
	}
}

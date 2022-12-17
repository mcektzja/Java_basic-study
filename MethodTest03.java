package study_practice;

public class MethodTest03 {
	//메소드 공부 03_잘못된 파라미터 분석
	//: 소스코드의 에러원인을 찾고 이를 주석으로 설명하시오
	//출처: 유튜브 홍팍- 메소드와 파라미터
	
	
	public static void printSquare(int x) {
		System.out.println(x * x);
	}
	
	public static void main(String[] args) {
		printSquare("hello");                //printSqure 메소드는 파라미터가 int 타입으로 받기 때문에 문자열을 받을 수 없다. 
		printSquare(5.5);					 //printSqure 메소드는 파라미터가 int 타입으로 받기 때문에 실수타입을 받을 수 없다.

	}

}

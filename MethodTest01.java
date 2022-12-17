package study_practice;

public class MethodTest01 {
	//메소드 공부 01_라면끓이기
	//: 메소드를 호출해 라면을 끓이는 과정을 출력하시오(ramyunProcessing()메소드 내부에서 호출할 것)
	//출처: 유튜브 홍팍-메소드 생성과 호출
	
	public static void main(String[] args) {
		ramyunProcessing();
	}

	private static void ramyunProcessing() {
		
		buy();
		fill();
		puton();
		boil();
		putinthepot();
		turnoff();
		eat();
		
	}
	private static void buy() {
		System.out.println("슈퍼에서 라면을 구입한다.");	
	}	
	
	private static void fill() {		
		System.out.println("주방에 들어가서 냄비에 물을 받는다.");
	}
	
	private static void puton() {
		System.out.println("가스렌지에 냄비를 올린다.");
	}
	
	private static void boil() {		
		System.out.println("가스불을 켜서 물을 끓인다.");
	}
	
	private static void putinthepot() {
		System.out.println("물이 끓으면 라면봉지를 뜯어 내용물을 넣는다.");
	}
	
	private static void turnoff() {		
		System.out.println("면이 취향에 맞게 익으면 가스 불을 끈다.");
		}
	
	private static void eat() {
		System.out.println("라면을 맛있게 먹는다.");	
	}	
	

}

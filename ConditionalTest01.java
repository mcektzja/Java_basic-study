package study_basic;

public class ConditionalTest01 {
	//조건문 공부 01_
	//: 캔맥주 한박스를 온라인으로 주문하기위해서는 성인인증이 필요하다. 입력 나이가 18세 이상인 경우 "주문이 완료되었습니다"라는 문구를 출력하시오.
	//출처: 유튜브 홍팍-조건문과 비교 논리 연산자

	public static void main(String[] args) {
		
		int age = 21;
		if(18 <= age) {
			System.out.println("주문이 완료되었습니다");
		}

	//조건문 공부 02_ if
	//: 체력과 마력이 동시에 2000을 넘어야만 착용가능한 아이템이 있다 체력과 마력을 입력하고 조건을 만족하는 경우 "아이템이 착용되었습니다"라는 문구를 출력하시오.
	//출처: 유튜브 홍팍-조건문과 비교 논리 연산자	
		
	//input = 체력 마력 , output = 아이템이 착용되었습니다 문구 출력
		int helth = 2400;	
		int magic = 3000;
		
		if(2000 <= helth && 2000 <= magic) {
			System.out.println("아이템이 착용되었습니다");
			
	//조건문 공부 03_ if else
	//: 한 취업  포털 사이트'사람윈'에서는 조건에 따라 기업의 등급을 평가한다고 한다. 칼퇴근(18시)이 가능하거나 하루 최대 근무시간이 8시간 이하인경우 "Good" 그렇지 않은 경우 "Bad.."라는 문구를 출력하세요.
	//출처: 유튜브 홍팍-조건문과 비교 논리 연산자	
			
		int workhour = 9;
		int time = 28;
		if(workhour<=8 || time == 18) {
			System.out.println("Good");
		}else {
			System.out.println("Bad..");
		}	
			
			
		}
		
		
	}
	
	

}

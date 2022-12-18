package study_basic;

public class ConditionalTest04 {

	public static void main(String[] args) {
		//조건문 공부 06_ 반복문+배열
		//: 자바 프로그래밍 시험에서 B+학점을 넘기면 장학금을 탈 수 있게 된 Kate(21)학생.
		//  아래 성적표 중 최고 득점자를 찾고 이를 출력하는 프로그램을 작성하시오
		//  성적표 = Elna 65, Suzie 74, John 23, Emily 75, Neda 68
		//         Kate 96, Alex 88, Daniel 98, Hamilton 54
		//출처: 유튜브 홍팍- 연습문제 반복문과 배열2

		String[] names = {"Elna", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};
		int topscore = 0;
		
		for(int i = 1; i<scores.length; i++) {
			if(scores[topscore] < scores[i]) {
				topscore = i;
			}	
		}	
		int i = topscore;
		System.out.println("1등: " + names[i] + "(" + scores[i] + ")");		
		


	}
}	

package study_basic;

import java.util.Arrays;

public class ConditionalTest03 {

	public static void main(String[] args) {
		//조건문 공부 05_ 반복문+배열
		//: 적절한 온도에서 배양을 하면 하루에 두 배씩 번식하는 세균이 있다.
		//  첫날 한 마리의 세균을 배양하여 1일 뒤에 두 마리가 되고.
		//  2일 후에는 네마리, 이러한 방식으로 마지막 9일 뒤 까지 512마리가 되었다.
		//  이 과정을 반복문과 배열을 사용하여 기록하고 출력하시오.
		//출처: 유튜브 홍팍- 연습문제 반복문과 배열1

	
		int[] bacterias = new int[10];
		
		for(int day = 0; day< bacterias.length; day++) {
			bacterias[day] =  (int)Math.pow(2,day);
		}
		
		
		System.out.println(Arrays.toString(bacterias));
		
	}

}

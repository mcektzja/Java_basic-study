package listandmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListandMapTest01 {

	public static void main(String[] args) {
		
		//list 이론 기초 연습
		List<Integer> list = new ArrayList<>();

		System.out.println(list.size()); // list의 크기를 나타내는 메소드
		System.out.println(list.add(5));// 0 인덱스 추가, add: list의 값을 추가하는 메소드
		System.out.println(list.add(4));// 1 인덱스 추가

		System.out.println(list.get(0));// 0 인덱스 읽기, get: list의 값을 읽는 메소드
		System.out.println(list.get(1));// 1
		System.out.println(list.toString());

		
		System.out.println("-----------------------");
		
		// list를 사용하여 0~19 값을 넣어보기
		list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		System.out.println(list.toString());

		
		System.out.println("-----------------------");
		
		// list에서 Math.max를 사용하여 최댓값(ceiling) 가져오기

		int ceiling = 0;
		for (int i = 0; i < list.size(); i++) {
			ceiling = Math.max(list.get(i), ceiling);
		}
		System.out.println("\n최댓값: " + ceiling);

		
		// list에서 Math.max를 사용하지 않고 최댓값(ceiling) 가져오기 
		ceiling = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > ceiling) {
				ceiling = list.get(i);
			}
		}
		System.out.println("\n최댓값: " + ceiling);
		

		
		
		System.out.println("-----------------------");

		//map 이론 기초 연습
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("열쇠-집", 3);
		map.put("열쇠-거실", 4);
		map.put("열쇠-사무실", 5);
		map.put("열쇠-거실", 5);

		System.out.println(map.get("열쇠-거실"));
		System.out.println(map.toString());	

	}

}

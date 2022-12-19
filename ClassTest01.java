package study_basic;

public class ClassTest01 {
		//클래스 공부 01_
		//Q.1: 현실세계의 회원을 Member 클래스로 모델링하려고 합니다. 회의원 데이터로는 이름(String), 아이디(String), 패스워드(String) 나이(int)가 있습니다.
		//     이 데이터들을 가지는 Member 클래스를 선언해보세요.
	
		//Q.2: 작성한 Member 클래스에 생성자를 추가하려고 합니다. 
	    //     다음과 같이 객체를 생성할 때 name 필드와 id 필드를 외부에서 받은 값으로 초기화하려면 생성자를 어떻게 선언해야 하나요?
        //     <다음> Member user1 = new Member("홍길동", "hong");
        //           Member user2 = new Member("강자바", "java");
	    //출처: 이것이 자바다(2022)	
}


//A.1
public class Member {

	String name;
	String id;
	String password;
	int age;

//A.2	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
}

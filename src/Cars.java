//부모
public class Cars {
	Cars(){
		System.out.println("Cars 생성자 기본형");
	}
	Cars(String name){
		System.out.println("Cars 생성자 2");
	}
	
	String name="홍길동";
	String color;
	int velocity;
	
	void speedUp() {
		velocity +=10;
		System.out.println(name + " 현재속력" + velocity);
	}
	
	void speedDown() {
		velocity -= 10;
		System.out.println(name + " 현재속력" + velocity);
	}
}

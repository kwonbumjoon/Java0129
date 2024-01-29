package ex02;

public class Person {
	int age;
	String name;
	
	void showInfo() {
		System.out.println("인스턴스 메소드");
	}
	
	static void staticShow() {
		System.out.println("static 메소드");
//		System.out.println(age);
//		System.out.println(name);
	}
}

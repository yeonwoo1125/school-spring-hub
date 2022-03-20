package kr.hs.study.main;


import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorldKr();
		//부모의 참조 변수로 자식 객체를 가리킴
		callMethod(hello);
	}

	public static void callMethod(HelloWorld hello) { //static은 객체 생성 안해도 호출 가능
		hello.sayHello();
	} 
}

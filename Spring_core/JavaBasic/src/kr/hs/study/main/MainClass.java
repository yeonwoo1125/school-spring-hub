package kr.hs.study.main;


import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorldKr();
		//�θ��� ���� ������ �ڽ� ��ü�� ����Ŵ
		callMethod(hello);
	}

	public static void callMethod(HelloWorld hello) { //static�� ��ü ���� ���ص� ȣ�� ����
		hello.sayHello();
	} 
}

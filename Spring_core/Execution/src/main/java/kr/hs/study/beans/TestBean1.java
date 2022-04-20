package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1의 method1");
	}
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1의 method2");
	}

	public void method1(int a1) {
		System.out.println("int 매개변수 method1");
	}
	
	public void method1(int a, int b) {
		System.out.println("int 매개변수 두개 method1");
	}
	public void method1(int a, String b) {
		System.out.println("int 매개변수, String 매개변수 method1");
	}
	public int method3() {
		System.out.println("int 리턴 method3");
		return 1;
	}
}

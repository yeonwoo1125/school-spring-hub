package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1�� method1");
	}
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1�� method2");
	}

	public void method1(int a1) {
		System.out.println("int �Ű����� method1");
	}
	
	public void method1(int a, int b) {
		System.out.println("int �Ű����� �ΰ� method1");
	}
	public void method1(int a, String b) {
		System.out.println("int �Ű�����, String �Ű����� method1");
	}
	public int method3() {
		System.out.println("int ���� method3");
		return 1;
	}
}

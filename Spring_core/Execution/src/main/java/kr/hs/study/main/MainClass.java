package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
		/*
		 * t1.method1(); t1.method1(1, 1);
		 */
		t1.method2();
		t1.method1(1, "spring");
		t1.method1(1, 2);
		t1.method1(1);
		t1.method1();
		t1.method3();
		ctx.close();

	}

}

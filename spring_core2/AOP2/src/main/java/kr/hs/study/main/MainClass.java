package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 testBean1 = ctx.getBean("t1",TestBean1.class);
		System.out.println(testBean1);

		testBean1.method1();
		testBean1.method2();
		ctx.close();
	}

}

package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean3 obj1 = ctx.getBean("t1", TestBean3.class);
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());
		System.out.println(obj1.getData3());
		System.out.println(obj1.getData4());

		ctx.close();
	}

}

package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean4;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean4 obj1 = ctx.getBean("t4", TestBean4.class);
		System.out.println("obj1 : "+obj1.getData1());
		System.out.println("obj1 : "+obj1.getData2());
		System.out.println("obj1 : "+obj1.getData4());
		
		System.out.println("-------------------------");
		
		TestBean4 obj2 = ctx.getBean("t5", TestBean4.class);
		System.out.println("obj2 : "+obj2.getData1());
		System.out.println("obj2 : "+obj2.getData2());
		System.out.println("obj2 : "+obj2.getData4());
		ctx.close();
	}
}

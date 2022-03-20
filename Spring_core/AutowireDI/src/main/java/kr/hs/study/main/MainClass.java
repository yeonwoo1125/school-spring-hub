package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean3;

public class MainClass {
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		/*
		 * TestBean obj1 = ctx.getBean("t1",TestBean.class);
		 * //System.out.println("obj1 : "+obj1);
		 * 
		 * TestBean obj2 = ctx.getBean("t2",TestBean.class);
		 * //System.out.println("obj2 : "+obj2);
		 */		
		TestBean obj3 = ctx.getBean("t3",TestBean.class);
		System.out.println("obj3 : "+obj3.getData1());
		System.out.println("obj3 : "+obj3.getData2());
		
		TestBean3 obj4 = ctx.getBean("t4",TestBean3.class);
		System.out.println("obj4 : "+obj4.getData3());
		System.out.println("obj4 : "+obj4.getData4());
		ctx.close();
	}
}

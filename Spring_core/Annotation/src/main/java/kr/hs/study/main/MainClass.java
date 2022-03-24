package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj1 = ctx.getBean("xml1", TestBean1.class);
		System.out.println(obj1.getData1());
		
		TestBean2 obj2 = ctx.getBean("xml2", TestBean2.class);
		System.out.println(obj2.getData1());
		
		TestBean2 obj3 = ctx.getBean("xml2", TestBean2.class);
		System.out.println(obj3.getData1());
		System.out.println(obj3.getData2());
		
		System.out.println("------------------------------------------");
		/*
		 * AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class); 
		 * TestBean2 obj4 =ctx2.getBean("t2",TestBean2.class); 
		 * System.out.println(obj4.getData1());
		 * ctx.close(); 
		 * ctx2.close();
		 */

	}

}

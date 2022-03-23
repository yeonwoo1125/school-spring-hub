package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfig;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		TestBean3 obj1 = ctx.getBean("test",TestBean3.class);
		System.out.println("obj1 : "+obj1);
		System.out.println("--------------------------------");
		
		TestBean3 obj2 = ctx.getBean("t2",TestBean3.class);
		System.out.println("obj2 : "+obj2);
		
		System.out.println("--------------------------------");
		TestBean4 obj3 = ctx.getBean("t4",TestBean4.class);
		System.out.println("obj3 : "+obj3.getData1());
		System.out.println("obj3 : "+obj3.getData2());
		System.out.println("obj3 : "+obj3.getData4());
		
		
		System.out.println("--------------------------------");
		TestBean4 obj4 = ctx.getBean("t5",TestBean4.class);
		System.out.println("obj4 : "+obj4.getData1());
		System.out.println("obj4 : "+obj4.getData2());
		System.out.println("obj4 : "+obj4.getData4());
		ctx.close();
	}
}

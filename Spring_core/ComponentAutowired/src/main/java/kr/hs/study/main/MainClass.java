package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		TestBean1 obj1 = ctx.getBean(TestBean1.class);
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());
		System.out.println(obj1.getData3());	
		ctx.close();
	}

}

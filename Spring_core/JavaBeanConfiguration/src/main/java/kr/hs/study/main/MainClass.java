package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanClassConfiguration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//beanµî·Ï
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanClassConfiguration.class);
		TestBean obj1 = ctx.getBean("testBean",TestBean.class);
		System.out.println("obj1 : "+obj1);
		
		TestBean obj2 = ctx.getBean("testBean2",TestBean.class);
		System.out.println("obj2 : "+obj2);
		ctx.close();
	}

}

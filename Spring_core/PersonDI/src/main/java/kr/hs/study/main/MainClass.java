package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.config.BeanConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

		Test obj1 = ctx.getBean("t1", Test.class);
		
		Test obj2 = ctx.getBean("t2", Test.class);
		
		Test obj3 = ctx.getBean("t3", Test.class);
		ctx.close();
	}

}

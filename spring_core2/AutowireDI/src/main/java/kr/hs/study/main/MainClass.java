package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ks/hs/study/config/config.xml");
		
		TestBean1 obj1 = ctx.getBean("t1",TestBean1.class);
		System.out.println("obj1.getA() : "+obj1.getA() );
		System.out.println("obj1.getB() : "+obj1.getB() );
		System.out.println("obj1.getC() : "+obj1.getC() );
		
		System.out.println("--------------------------------------------------");
		TestBean2 obj2 = ctx.getBean("t2",TestBean2.class);
		System.out.println("obj2.getA() : "+obj2.getA() );
		System.out.println("obj2.getB() : "+obj2.getB() );
		System.out.println("obj2.getC() : "+obj2.getC() );
		ctx.close();
	}

}
 
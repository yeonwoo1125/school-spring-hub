package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.DataBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		DataBean1 obj1 = ctx.getBean("d1",DataBean1.class);
		
		DataBean1 obj3 = ctx.getBean("d3",DataBean1.class);
		System.out.println(obj3);
		
		DataBean1 obj4 = ctx.getBean("d3",DataBean1.class);
		System.out.println(obj1);
		ctx.close();
		
	}

}

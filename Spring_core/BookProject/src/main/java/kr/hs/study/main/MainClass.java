package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;


public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book m1 = ctx.getBean("m1", Book.class);
		m1.print();

		System.out.println("-----------------------------------");
		
		Book p1 = ctx.getBean("p1", Book.class);
		p1.print();

		System.out.println("-----------------------------------");
		
		Book n1 = ctx.getBean("n1", Book.class);
		n1.print();
		
		ctx.close();
	}
}

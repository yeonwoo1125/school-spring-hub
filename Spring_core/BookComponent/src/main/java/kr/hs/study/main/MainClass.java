package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Book b1 = ctx.getBean(Magazine.class);
		b1.print();
		
		Book b2 = ctx.getBean(Novel.class);
		b2.print();
		
		Book b3 = ctx.getBean(Poet.class);
		b3.print();
	}

}

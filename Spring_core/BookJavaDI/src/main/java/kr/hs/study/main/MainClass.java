package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Book obj1 = ctx.getBean("n1", Novel.class);
		Book obj2 = ctx.getBean("p1", Poet.class);
		Book obj3 = ctx.getBean("m1", Magazine.class);
		
		obj1.print();
		obj2.print();
		obj3.print();

		ctx.close();
	}

}

package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.publisher;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Designer d1 = ctx.getBean(Designer.class);
		d1.Checkin();
		d1.Checkout();
		
		Developer de1 = ctx.getBean(Developer.class);
		de1.Checkin();
		de1.Checkout();
		
		publisher p1 = ctx.getBean(publisher.class);
		p1.Checkin();
		p1.Checkout();
	}

}

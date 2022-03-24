package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.publisher;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Employee obj1 = ctx.getBean("dev1",Developer.class);
		Employee obj2 = ctx.getBean("des1",Designer.class);
		Employee obj3 = ctx.getBean("pub1", publisher.class);
		
		obj1.Checkin();
		obj1.Checkout();
		obj2.Checkin();
		obj2.Checkout();
		obj3.Checkin();
		obj3.Checkout();
		
		ctx.close();
	}

}

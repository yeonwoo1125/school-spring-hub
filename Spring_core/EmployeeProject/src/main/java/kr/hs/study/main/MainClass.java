package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.publisher;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Designer designer1 = ctx.getBean("des1",Designer.class);
		designer1.Checkin();
		designer1.Checkout();
		
		Developer developer1 = ctx.getBean("dev1",Developer.class);
		developer1.Checkin();
		developer1.Checkout();
		
		publisher publisher1 = ctx.getBean("pub1",publisher.class);
		publisher1.Checkin();
		publisher1.Checkout();
		
		ctx.close();
	}

}

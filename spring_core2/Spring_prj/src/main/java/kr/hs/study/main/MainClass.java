package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Animal;
import kr.hs.study.beans.Cat;
import kr.hs.study.beans.Dog;
import kr.hs.study.beans.Rabbit;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Animal c1 = ctx.getBean("cat1",Cat.class);
		Animal r1 = ctx.getBean("rabbit1",Rabbit.class);
		Animal d1 = ctx.getBean("dog1",Dog.class);
		
//		System.out.println(c1);
//		System.out.println(r1);
//		System.out.println(d1);
	}

}

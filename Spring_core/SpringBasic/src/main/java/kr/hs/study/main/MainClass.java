package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		//IOC Container
		//config.xml을 로딩 : 객체 생성 후 컨테이너에 보관
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//객체 가져오기
		//getBean을 사용해 컨테이너에 있는 객체를 가져옴
		
		//getBean은 오브젝트 타입이기 때문에 다운 캐스팅
		TestBean test1 =(TestBean)ctx.getBean("test1");
		System.out.println("test1 : " + test1);
		
		//객체 가져오는 2번째 방법
		TestBean test2 = ctx.getBean("test1", TestBean.class);
		System.out.println("test2 : "+test2);
		
		ctx.close();
		
	}

}

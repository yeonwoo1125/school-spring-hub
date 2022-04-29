package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//dao 가져오기
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		//TestBean 객체 t1 만들어서 10, spring 넣기
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setData1(10);
		t1.setData2("spring");
		
		//dao.insert_data 호출
		dao.insertData(t1);

		TestBean t2 = ctx.getBean(TestBean.class);
		t2.setData1(20);
		t2.setData2("spring2");
		ctx.close();

	}

}
         
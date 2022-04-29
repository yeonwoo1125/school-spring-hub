package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//dao ��������
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		//TestBean ��ü t1 ���� 10, spring �ֱ�
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setData1(10);
		t1.setData2("spring");
		
		//dao.insert_data ȣ��
		dao.insertData(t1);

		TestBean t2 = ctx.getBean(TestBean.class);
		t2.setData1(20);
		t2.setData2("spring2");
		ctx.close();

	}

}
         
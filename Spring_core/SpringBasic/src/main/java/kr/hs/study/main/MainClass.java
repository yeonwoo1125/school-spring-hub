package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		//IOC Container
		//config.xml�� �ε� : ��ü ���� �� �����̳ʿ� ����
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//��ü ��������
		//getBean�� ����� �����̳ʿ� �ִ� ��ü�� ������
		
		//getBean�� ������Ʈ Ÿ���̱� ������ �ٿ� ĳ����
		TestBean test1 =(TestBean)ctx.getBean("test1");
		System.out.println("test1 : " + test1);
		
		//��ü �������� 2��° ���
		TestBean test2 = ctx.getBean("test1", TestBean.class);
		System.out.println("test2 : "+test2);
		
		ctx.close();
		
	}

}

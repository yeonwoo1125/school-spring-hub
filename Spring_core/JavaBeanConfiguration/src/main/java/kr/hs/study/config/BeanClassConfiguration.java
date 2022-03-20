package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean;

//config.xml�� ������ �ϴ� �ڹ� ����

//spring ��ü ���� ���� �������� ����ϴ� ������̼�
@Configuration
public class BeanClassConfiguration {
	
	//bean ����
	//<bean id="" class=""/>
	@Bean
	public TestBean testBean() {
		TestBean t1 = new TestBean();
		return t1;
	}
	
	@Bean
	public TestBean testBean2() {
		return  new TestBean();
	}
}

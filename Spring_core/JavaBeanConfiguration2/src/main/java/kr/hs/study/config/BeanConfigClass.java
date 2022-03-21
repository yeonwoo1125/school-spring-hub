package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration //�� ������ ���� ������ ����ϴ� ���� ���� == config.xml
public class BeanConfigClass {
	
	@Bean //�Ʒ��� �޼��� ����� bean���� ����� �����̳ʿ� ���
	public TestBean1 testBean1() {
		return new TestBean1();
	}
	
	@Bean(name="tttt") //name�Ӽ����� ��ü ���� ����
	public TestBean1 testBean2() {
		return new TestBean1();
	}
	
	@Bean
	@Lazy //lazy-init�� ����
	@Scope("prototype")
	public TestBean1 testBean3() {
		return new TestBean1();
	}
}

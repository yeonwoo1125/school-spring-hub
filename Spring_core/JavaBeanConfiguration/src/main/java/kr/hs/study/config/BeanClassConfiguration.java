package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean;

//config.xml의 역할을 하는 자바 파일

//spring 객체 생성 설정 파일임을 명시하는 어노테이션
@Configuration
public class BeanClassConfiguration {
	
	//bean 생성
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

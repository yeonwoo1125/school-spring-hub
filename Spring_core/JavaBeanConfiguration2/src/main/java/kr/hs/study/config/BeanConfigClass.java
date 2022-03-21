package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration //이 파일은 빈을 만들라고 명령하는 설정 파일 == config.xml
public class BeanConfigClass {
	
	@Bean //아래의 메서드 결과를 bean으로 만들어 컨테이너에 등록
	public TestBean1 testBean1() {
		return new TestBean1();
	}
	
	@Bean(name="tttt") //name속성으로 객체 생성 가능
	public TestBean1 testBean2() {
		return new TestBean1();
	}
	
	@Bean
	@Lazy //lazy-init과 같음
	@Scope("prototype")
	public TestBean1 testBean3() {
		return new TestBean1();
	}
}

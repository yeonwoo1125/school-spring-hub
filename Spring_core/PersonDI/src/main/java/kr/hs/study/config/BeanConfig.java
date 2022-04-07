package kr.hs.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person1;
import kr.hs.study.beans.Person2;
import kr.hs.study.beans.Test;



@Configuration
public class BeanConfig {

	@Bean
	public Person1 p1() {
		return new Person1("park", 20);
	}
	
	@Bean
	public Person2 p2() {
		return new Person2("kim", 30);
	}
	

	@Bean
	public Test t1() {
		return new Test();
	}
	
	@Bean
	public Test t2() {
		return new Test();
	}
	
	@Bean
	public Test t3() {
		return new Test();
	}
}

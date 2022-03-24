package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

@Configuration
public class BeanConfigClass {

	@Bean
	public Magazine m1() {
		return new Magazine("ÀâÁöÁöÁöÂ¢", 10000);
	}
	
	@Bean
	public Poet p1() {
		return new Poet("½Ã½Ã½Ë¤µ", 20000);
	}
	
	@Bean
	public Novel n1() {
		return new Novel("¼Ò¼­·¯·²", 15000);
	}
}

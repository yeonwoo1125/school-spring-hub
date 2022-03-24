package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.publisher;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public Designer des1() {
		return new Designer(7,10);
	}
	
	@Bean
	public Developer dev1() {
		return new Developer(7,10);
	}
	
	@Bean
	public publisher pub1() {
		return new publisher(11,6);
	}
}

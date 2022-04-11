package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Novel implements Book{

	private String novelName;
	private int novelPrice;
	
	
	public void buy() {
		System.out.println("kim의 소설 "+novelName+"을 "+novelPrice+"원에 산다." );
		
	}

	public void sell() {
		System.out.println("kim의 소설 "+novelName+"을 "+novelPrice+"원에 판다." );
		
	}

	public void create() {
		System.out.println("kim의 소설 "+novelName+"을 쓴다." );
		
	}
	
	public Novel(@Value("소서러럴")String novelName, @Value("100000")int novelPrice) {
		this.novelName = novelName;
		this.novelPrice = novelPrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}

}

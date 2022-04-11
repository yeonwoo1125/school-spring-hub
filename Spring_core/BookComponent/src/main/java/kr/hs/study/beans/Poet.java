package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Poet implements Book{

	private String poetName;
	private int poetPrice;
	
	public void buy() {
		System.out.println("lee의 시 "+poetName+"을 "+poetPrice+"원에 산다." );
		
	}

	public void sell() {
		System.out.println("lee의 시 "+poetName+"을 "+poetPrice+"원에 판다." );
		
	}

	public void create() {
		System.out.println("lee의 시 "+poetName+"을 쓴다." );
		
	}

	public Poet(@Value("시싰")String poetName, @Value("5000")int poetPrice) {
		this.poetName = poetName;
		this.poetPrice = poetPrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}
}

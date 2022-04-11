package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Magazine implements Book{
	
	private String magazineName;
	private int magazinePrice;

	public void buy() {
		System.out.println("park의 잡지 "+magazineName+"을 "+magazinePrice+"원에 산다.");
		
	}

	public void sell() {
		System.out.println("park의 잡지 "+magazineName+"을 "+magazinePrice+"원에 판다.");
		
	}

	public void create() {
		System.out.println("park의 잡지 "+magazineName+"을 쓴다.");
		
	}

	public Magazine(@Value("잡지지지")String magazineName, @Value("10000")int magazinePrice) {
		this.magazineName = magazineName;
		this.magazinePrice = magazinePrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}

}

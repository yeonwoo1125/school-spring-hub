package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Magazine implements Book{
	
	private String magazineName;
	private int magazinePrice;

	public void buy() {
		System.out.println("park�� ���� "+magazineName+"�� "+magazinePrice+"���� ���.");
		
	}

	public void sell() {
		System.out.println("park�� ���� "+magazineName+"�� "+magazinePrice+"���� �Ǵ�.");
		
	}

	public void create() {
		System.out.println("park�� ���� "+magazineName+"�� ����.");
		
	}

	public Magazine(@Value("��������")String magazineName, @Value("10000")int magazinePrice) {
		this.magazineName = magazineName;
		this.magazinePrice = magazinePrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}

}

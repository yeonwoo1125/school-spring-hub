package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Novel implements Book{

	private String novelName;
	private int novelPrice;
	
	
	public void buy() {
		System.out.println("kim�� �Ҽ� "+novelName+"�� "+novelPrice+"���� ���." );
		
	}

	public void sell() {
		System.out.println("kim�� �Ҽ� "+novelName+"�� "+novelPrice+"���� �Ǵ�." );
		
	}

	public void create() {
		System.out.println("kim�� �Ҽ� "+novelName+"�� ����." );
		
	}
	
	public Novel(@Value("�Ҽ�����")String novelName, @Value("100000")int novelPrice) {
		this.novelName = novelName;
		this.novelPrice = novelPrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}

}

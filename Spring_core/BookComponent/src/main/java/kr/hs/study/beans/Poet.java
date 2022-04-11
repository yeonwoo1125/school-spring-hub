package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Poet implements Book{

	private String poetName;
	private int poetPrice;
	
	public void buy() {
		System.out.println("lee�� �� "+poetName+"�� "+poetPrice+"���� ���." );
		
	}

	public void sell() {
		System.out.println("lee�� �� "+poetName+"�� "+poetPrice+"���� �Ǵ�." );
		
	}

	public void create() {
		System.out.println("lee�� �� "+poetName+"�� ����." );
		
	}

	public Poet(@Value("�Ú�")String poetName, @Value("5000")int poetPrice) {
		this.poetName = poetName;
		this.poetPrice = poetPrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}
}

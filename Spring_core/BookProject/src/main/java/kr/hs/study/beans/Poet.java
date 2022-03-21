package kr.hs.study.beans;

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

	public Poet(String poetName, int poetPrice) {
		this.poetName = poetName;
		this.poetPrice = poetPrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}
}

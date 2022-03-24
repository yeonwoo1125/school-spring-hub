package kr.hs.study.beans;

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

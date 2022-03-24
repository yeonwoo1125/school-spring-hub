package kr.hs.study.beans;

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
	
	public Novel(String novelName, int novelPrice) {
		this.novelName = novelName;
		this.novelPrice = novelPrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}

}

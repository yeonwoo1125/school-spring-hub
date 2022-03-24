package kr.hs.study.beans;

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

	public Magazine(String magazineName, int magazinePrice) {
		this.magazineName = magazineName;
		this.magazinePrice = magazinePrice;
	}

	public void print() {
		create();
		sell();
		buy();
	}
	
	

}

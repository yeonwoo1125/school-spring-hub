package kr.hs.study.beans;

public class Designer implements Employee{

	private int inTime;
	private int outTime;
	
	public void Checkin() {
		System.out.println("디자이너 "+inTime+"시 출근");
		
	}

	public void Checkout() {
		System.out.println("디자이너 "+outTime+"시 출근");
	}

	public Designer(int inTime, int outTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
	
}

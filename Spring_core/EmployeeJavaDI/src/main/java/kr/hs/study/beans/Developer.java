package kr.hs.study.beans;

public class Developer implements Employee{

	private int inTime;
	private int outTime;
	
	public void Checkin() {
		System.out.println("개발자 "+inTime+"시 출근");
		
	}

	public void Checkout() {
		System.out.println("개발자 "+outTime+"시 출근");
	}

	public Developer(int inTime, int outTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
	
}

package kr.hs.study.beans;

public class publisher implements Employee{
	
	private int inTime;
	private int outTime;
	
	public void Checkin() {
		System.out.println("퍼블리셔 "+inTime+"시 출근");
		
	}

	public void Checkout() {
		System.out.println("퍼블리셔  "+outTime+"시 출근");
	}

	public publisher(int inTime, int outTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
}

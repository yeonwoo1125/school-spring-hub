package kr.hs.study.beans;

public class publisher implements Employee{
	
	private int inTime;
	private int outTime;
	
	public void Checkin() {
		System.out.println("�ۺ��� "+inTime+"�� ���");
		
	}

	public void Checkout() {
		System.out.println("�ۺ���  "+outTime+"�� ���");
	}

	public publisher(int inTime, int outTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
}

package kr.hs.study.beans;

public class Designer implements Employee{

	private int inTime;
	private int outTime;
	
	public void Checkin() {
		System.out.println("�����̳� "+inTime+"�� ���");
		
	}

	public void Checkout() {
		System.out.println("�����̳� "+outTime+"�� ���");
	}

	public Designer(int inTime, int outTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
	
}

package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee{

	private int inTime;
	private int outTime;
	
	public void Checkin() {
		System.out.println("개발자 "+inTime+"시 출근");
		
	}

	public void Checkout() {
		System.out.println("개발자 "+outTime+"시 출근");
	}

	public Developer(@Value("10")int inTime, @Value("7")int outTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
	}
	public int getInTime() {
		return inTime;
	}

	public int getOutTime() {
		return outTime;
	}
	
}

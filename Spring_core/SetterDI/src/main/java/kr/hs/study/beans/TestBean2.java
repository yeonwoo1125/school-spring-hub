package kr.hs.study.beans;

public class TestBean2 {
	private DataBean data1;
	private DataBean data2;
	public DataBean getData1() {
		return data1;
	}
	public void setData1(DataBean data1) {
		this.data1 = data1;
	}
	public DataBean getData2() {
		return data2;
	}
	public void setData2(DataBean data2) {
		this.data2 = data2;
	}
	
	public void print() {
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
	}
}

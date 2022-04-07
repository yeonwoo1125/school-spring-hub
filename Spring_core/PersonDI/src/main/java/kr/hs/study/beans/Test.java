package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
	@Autowired
	private Person1 p1;
	@Autowired
	private Person2 p2;

	
	public Person1 getP1() {
		return p1;
	}
	public Person2 getP2() {
		return p2;
	}
	
}

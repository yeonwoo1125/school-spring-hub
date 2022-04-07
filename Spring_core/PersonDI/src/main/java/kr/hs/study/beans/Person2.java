package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class Person2 implements Person{

	String name;
	int age;
	
	public void eat() {
		System.out.println(name+" "+age+" "+"ธิดู");
		
	}

	public Person2(String name,int age) {

		this.age=age;
		this.name=name;
		eat();
	}
}

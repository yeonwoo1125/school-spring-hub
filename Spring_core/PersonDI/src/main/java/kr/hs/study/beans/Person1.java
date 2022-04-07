package kr.hs.study.beans;


public class Person1 implements Person{
	String name;
	int age;
	
	public void eat() {
		System.out.println(name+" "+age+" "+"ธิดู");
		
	}

	public Person1(String name,int age) {
		
		this.age=age;
		this.name=name;
		eat();
	}
}

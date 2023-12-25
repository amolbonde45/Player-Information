package com.player;

public class Player {
	String name;
	int jno;
	int age;
	
	public Player() {
		this.name=null;
		this.jno=0;
		this.age=0;
	}

	public Player(String name, int jno, int age) {
		super();
		this.name = name;
		this.jno = jno;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		
		return "Palyer name is : "+this.name+"\nJersey Num is :"+this.jno+"\nAge is : "+this.age;
	}
	
	
	

}

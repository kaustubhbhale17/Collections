package com.collection;

public class Patient implements Comparable<Patient>{
	
	private int patientId;
	private String name;
	private int age;
	
	
	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Patient p1) {
		if(p1.age <age)
			return 1;
		else if(age ==p1.age)
			return 0;
		return -1;
	}
	
	
}

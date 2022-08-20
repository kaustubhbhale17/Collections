package com.collection;

import java.util.LinkedHashSet;

public class TestPatinetSet {

	
	public static void main(String[] args) {
		LinkedHashSet<Patient>  lhs = new LinkedHashSet<Patient>();
		Patient p1 = new Patient(100,"Ajit",23);
		Patient p2 = new Patient(102,"Arun",29);
		Patient p3 = new Patient(100,"Ajit",23);
		
		lhs.add(p1);lhs.add(p2);lhs.add(p3);lhs.add(p1);
		
		System.out.println(lhs.size());
		for(Patient p : lhs)
			System.out.println(p.getPatientId()+" "+p.getName()+" "+p.getAge());

	}

}

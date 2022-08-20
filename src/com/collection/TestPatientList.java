package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestPatientList {

	public static int getPatinetAge(String name,ArrayList<Patient> patientList){
		for(Patient p : patientList){
			if(p.getName()==name)
				return p.getAge();
		}
		return -1;
	}
	public static void main(String[] args) {
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		
		Patient p1 = new Patient(100,"Ajit",23);
		Patient p2 = new Patient(101,"Suresh",29);
		Patient p3 = new Patient(104,"John",18);
		
		patientList.add(p1);patientList.add(p2);patientList.add(p3);
		
		Collections.sort(patientList);
		for(Patient p : patientList)
			System.out.println(p.getPatientId()+" "+p.getName()+" "+p.getAge());
		
		System.out.println(getPatinetAge("Ron", patientList));
		
	}

}

package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMarks {
	
	public static void printList(List<Double> studentMarks){
		int counter=1;
		Iterator it = studentMarks.iterator();
		
		while(it.hasNext()){
			System.out.print((counter++)+"-"+it.next());
			if(it.hasNext())
				System.out.print(",");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents;
		double average = 0.0,sumOfMarks = 0.0,max;
		
		System.out.println("Input number of Students ");
		numberOfStudents = scanner.nextInt();
		
		List<Double> studentMarks = new ArrayList<Double>();

		System.out.println("Enter Marks");
		for(int i=0;i<numberOfStudents;i++){
			studentMarks.add(scanner.nextDouble());
		}
		max=studentMarks.get(0);
		for(int i=0;i<studentMarks.size();i++){
			if(max<studentMarks.get(i))
				max=studentMarks.get(i);
			sumOfMarks+=studentMarks.get(i);
		}
		
		average = (sumOfMarks)/numberOfStudents;
		System.out.println();System.out.println();
		System.out.println("Highest Marks : "+max);
		System.out.println("Average Marks : "+average);
		System.out.print("Marks:");
		printList(studentMarks);
		
		System.out.println("\n"+"3rd Student marks : "+studentMarks.get(2));
		
		Collections.sort(studentMarks);
		System.out.print("Sorted:");
		printList(studentMarks);
	}

}

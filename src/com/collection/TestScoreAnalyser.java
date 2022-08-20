package com.collection;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class TestScoreAnalyser {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double runs;
		int counter=0;
		
		LinkedList<Double> runsByBatter = new LinkedList<Double>();
		System.out.println("Enter Runs");
		
		while(counter<5){
			runs = scanner.nextInt();
			runsByBatter.add(runs);
			counter++;
		}
		ScoreAnalyser scoreAnalyser = new ScoreAnalyser(runsByBatter);
		
		System.out.println();
		System.out.print("Runs Scored: ");
		scoreAnalyser.displayRuns();
		System.out.println("\n"+"RunRate: "+scoreAnalyser.calRunRate());
		System.out.println("Lowest Score: "+scoreAnalyser.lowestRunsScored());
		System.out.println("Count of player who batted: "+runsByBatter.size());
		
	}

}

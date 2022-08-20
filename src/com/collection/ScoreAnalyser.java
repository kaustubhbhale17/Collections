package com.collection;

import java.util.LinkedList;

public class ScoreAnalyser {
	private LinkedList<Double> runsData;

	public ScoreAnalyser(LinkedList<Double> runsData) {
		super();
		this.runsData = runsData;
	}

	public LinkedList<Double> getRunsData() {
		return runsData;
	}

	public void setRunsData(LinkedList<Double> runsData) {
		this.runsData = runsData;
	}
	
	public void addRunsToList(double runs){
		runsData.add(runs);
	}
	
	public double calRunRate(){
		int totalRuns=0;
		for(int i=0;i<runsData.size();i++){
			totalRuns+=runsData.get(i);
		}
		return totalRuns/50.0;
	}
	
	public double lowestRunsScored(){
		double min = runsData.get(0);
		for(int i=0;i<runsData.size();i++){
			if(min > runsData.get(i))
				min=runsData.get(i);
		}
		return min;
	}
	
	public void displayRuns(){
		int counter=0;
		for(Double i : runsData){
			System.out.print((++counter)+"-"+i);
			if(i>runsData.size()-1)
				System.out.print(",");
		}
	}
	
}

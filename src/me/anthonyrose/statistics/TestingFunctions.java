package me.anthonyrose.statistics;

import java.util.ArrayList;

public class TestingFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Stdev works
		BasicStatistics mStatistics = new BasicStatistics();
		ArrayList<Double> pop = new ArrayList<Double>();
		pop.add((double) 30); //1
		pop.add((double) 31); //2
		pop.add((double) 29); //3
		pop.add((double) 30); //4
		pop.add((double) 32); //5
		pop.add((double) 32); //6
		pop.add((double) 31); //7
		pop.add((double) 28); //8
		
		System.out.println("time pre : " + System.currentTimeMillis());
		System.out.println(mStatistics.stdev(pop));
		System.out.println("time post : " + System.currentTimeMillis()); 
	}

}

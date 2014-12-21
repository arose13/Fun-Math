package me.anthonyrose.statistics;

import java.util.ArrayList;

public class TestingFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO test functions below
		BasicStatistics mStatistics = new BasicStatistics();
		ArrayList<Double> pop = new ArrayList<Double>();
		pop.add((double) 74);
		pop.add((double) 112);
		pop.add((double) 124);
		pop.add((double) 88);
		pop.add((double) 96);
		pop.add((double) 96);
		pop.add((double) 119);
		pop.add((double) 100);
		pop.add((double) 103);
		pop.add((double) 86);
		pop.add((double) 69);
		pop.add((double) 92);
		pop.add((double) 87);
		
		double stdev = mStatistics.stdev(pop);
		double mean = mStatistics.mean(pop);
		
		ZScore mZScore = new ZScore();
		
		double z = mZScore.getZfromX(144, 100, 15);
		
		System.out.println("time pre  : " + System.currentTimeMillis());
		System.out.println(mean);
		System.out.println(stdev);
		System.out.println(z);
		System.out.println((mZScore.getProbability(z) * 100) + "%");
		System.out.println("time post : " + System.currentTimeMillis()); 
	}

}

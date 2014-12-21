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
		pop.add((double) 22); //1
		pop.add((double) 23); //2
		pop.add((double) 22); //3
		pop.add((double) 20); //3
		pop.add((double) 22); //3
		pop.add((double) 26); //3
		pop.add((double) 21); //3
		pop.add((double) 24); //3
		pop.add((double) 23); //3
		pop.add((double) 19); //3
		
		double stdev = mStatistics.stdev(pop);
		double mean = mStatistics.mean(pop);
		
		NormalDistn mDistn = new NormalDistn();
		
		System.out.println("time pre  : " + System.currentTimeMillis());
		System.out.println(mean);
		System.out.println(stdev);
		System.out.println(mDistn.normalDistnPDF(23, mean, stdev));
		System.out.println("time post : " + System.currentTimeMillis()); 
	}

}

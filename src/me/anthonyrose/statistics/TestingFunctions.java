package me.anthonyrose.statistics;

import java.util.ArrayList;

public class TestingFunctions {

	public static void main(String[] args) {
		// TODO test functions below
		BasicStatistics mStatistics = new BasicStatistics();
		NormalDistn mDistn = new NormalDistn();
		
		ArrayList<Double> pop = new ArrayList<Double>();
		
		double inputmean = 100;
		double inputstdev = 15;
		
		logger("Input stdev: " + inputstdev);
		
		pop = mDistn.getRandomNumberListFromDistn(inputmean, inputstdev, (int) (1 * Math.pow(10, 6)));
		
		double stdev = mStatistics.stdev(pop);
		double mean = mStatistics.mean(pop);
		
		long pretime = System.currentTimeMillis();
		for (Double iq : pop) {
			logger(iq);
		}
		long posttime = System.currentTimeMillis();
		logger("mean: " + mean + " and stdev: " + stdev);
		logger("time pre  : " + pretime);
		logger("time post : " + posttime);
		logger("delta time :" + (posttime - pretime));
	}
	
	private static void logger(Object msg) {
		System.out.println(msg);
	}

}

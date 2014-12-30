package me.anthonyrose.statistics;

import java.util.ArrayList;

public class TestingFunctions {

	public static void main(String[] args) {
		// TODO test functions below
		BasicStatistics mStatistics = new BasicStatistics();
		NormalDistn mDistn = new NormalDistn();

		ArrayList<Double> pop = new ArrayList<Double>();
		pop = mDistn.getRandomNumberListFromDistn(100, 15, (int) (33 * Math.pow(10, 6)));
		double above120 = 0;
		double above140 = 0;
		double above160 = 0;
		double above180 = 0;
		for (Double x : pop) {
			if (x >= 120) above120 = above120 + 1;
			if (x >= 140) above140 = above140 + 1;
			if (x >= 160) above160 = above160 + 1;
			if (x >= 180) above180 = above180 + 1;
		}
		logger("max value: " + mStatistics.getMax(pop));
		logger("mean valu: " + mStatistics.mean(pop));
		logger("min value: " + mStatistics.getMin(pop));
		logger("above 120: " + above120);
		logger("above 140: " + above140);
		logger("above 160: " + above160);
		logger("above 180: " + above180);
	}

	private static void logger(Object msg) {
		System.out.println(msg);
	}

}

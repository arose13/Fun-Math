package me.anthonyrose.statistics;

import java.util.ArrayList;
import java.util.Random;

public class NormalDistn {
	
	/* Created by AnthonyRose */
	
	private Random mRandom = new Random();
	
	public double normalDistnPDF(double x, double mean, double stdev) {
		
		double eNumer = (-1) * (Math.pow((x - mean), 2));
		double eDenom = 2 * (Math.pow(stdev, 2));
		
		double numerator = Math.exp( eNumer / eDenom );
		double denominator = (Math.sqrt( 2 * Math.PI )) * stdev;
		
		if (denominator == 0) {
			return 0; // Divide by zero
		} else {
			return (numerator / denominator);
		}		
	}
	
	public double getRandomNumberFromDistn(double mean, double stdev) {
		return (mean + mRandom.nextGaussian() * stdev);
	}
	
	public ArrayList<Double> getRandomNumberListFromDistn(double mean, double stdev, int n) {
		ArrayList<Double> randomList = new ArrayList<Double>();
		for (int i = 0; i < n; i++) {
			randomList.add( getRandomNumberFromDistn(mean, stdev) );
		}
		return randomList; 
	}
	
}

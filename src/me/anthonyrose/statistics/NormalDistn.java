package me.anthonyrose.statistics;

public class NormalDistn {
	
	/* Created by AnthonyRose */
	
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
	
}

package me.anthonyrose.statistics;

public class NDPoint {
	
	public double[] dimensionLocals;
	
	public NDPoint(double... n) {
		dimensionLocals = n;
	}
	
	// This is a temporary test method
	public static double testSum(double... ds) {
		double sum = 0;
		for (int i = 0; i < ds.length; i++) {
			sum = sum + ds[i];
		}
		return sum;
	}
	
	public int getNumberOfDimensions() {
		return dimensionLocals.length;
	}
	
	public double getNthValue(int d) {
		return dimensionLocals[d];
	}
	
}

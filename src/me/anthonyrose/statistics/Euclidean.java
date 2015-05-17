package me.anthonyrose.statistics;

public class Euclidean {
	
	// Make one for an arbitrary number of dimensions
	public static double distance2(double x1, double y1, double x2, double y2) {
		return Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));
	}
	
	// Gets the distance between 2 points in an arbitrary number of dimensions
	public static double distanceArb(NDPoint p, NDPoint q) {
		double diffSq = 0;
		
		for (int i = 0; i < p.getNumberOfDimensions(); i++) {
			diffSq = diffSq + Math.pow( (p.getNthValue(i) - q.getNthValue(i)) , 2);
		}		
		
		return ( Math.sqrt(diffSq) );		
	}

}

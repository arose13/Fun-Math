package me.anthonyrose.statistics;

public class Euclidean {
	
	// Make one for an arbitrary number of dimensions
	public static double distance2(double x1, double y1, double x2, double y2) {
		return Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));
	}
	
    public static void main(String[] args)
    {
	double x1 = Double.parseDouble(args[0]);
	double y1 = Double.parseDouble(args[1]);
	double x2 = Double.parseDouble(args[2]);
	double y2 = Double.parseDouble(args[3]);

	double  xDiff = x1-x2;
        double  xSqr  = Math.pow(xDiff, 2);

	double yDiff = y1-y2;
	double ySqr = Math.pow(yDiff, 2);

	double output   = Math.sqrt(xSqr + ySqr);
	
	System.out.println("Distance = " + output);  

    }

}

package me.anthonyrose.statistics;

public class ZScore {
	
	/* Created by Anthony Rose
	 * This class is capable of computing the 
	 * probability of particular value or more
	 * extreme */
	private double Z_MAX = 6; // Maximum absolute value the z score can be
	
	/* Returns values [0,1] */
	public double getProbability(double z) {
		double y,x,w;
		if (z == 0) {
			x = 0;
		} else {
			y = 0.5 * Math.abs(z);
			if (y > (Z_MAX * 0.5)) {
				x = 1.0;
			} else if (y < 1.0) {
				w = Math.pow(y, 2);
				x = ((((((((0.000124818987 * w
                        - 0.001075204047) * w + 0.005198775019) * w
                        - 0.019198292004) * w + 0.059054035642) * w
                        - 0.151968751364) * w + 0.319152932694) * w
                        - 0.531923007300) * w + 0.797884560593) * y * 2.0;
			} else {
				y = y - 2;
				x = (((((((((((((-0.000045255659 * y
                        + 0.000152529290) * y - 0.000019538132) * y
                        - 0.000676904986) * y + 0.001390604284) * y
                        - 0.000794620820) * y - 0.002034254874) * y
                        + 0.006549791214) * y - 0.010557625006) * y
                        + 0.011630447319) * y - 0.009279453341) * y
                        + 0.005353579108) * y - 0.002141268741) * y
                        + 0.000535310849) * y + 0.999936657524;
			}
		}
		return z > 0 ? ((x + 1) * 0.5) : ((1 - x) * 0.5);
	}
	
	/* Return ZScore from a particular value */
	public double getZfromX(double x, double mean, double stdev) {
		if (stdev > 0) {
			return ((x - mean) / stdev);
		} else {
			return 0;
		}
	}
}

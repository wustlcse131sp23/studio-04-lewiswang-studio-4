package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//StdDraw.rectangle(0.5, 0.5, 0.35, 0.05);
		//StdDraw.rectangle(0.5, 0.5, 0.05, 0.35);
		
		//StdDraw.rectangle(0.5, 0.5, 0.01, 0.01);
		
		for(double i = 0.1;i<=0.9;i=i+0.01) {
			StdDraw.setPenColor(Color.red);
			StdDraw.filledRectangle(i,i,0.02,0.02);
			StdDraw.setPenColor(Color.blue);
			StdDraw.filledRectangle(1-i, i, 0.02, 0.02);
		}
		
		
		StdDraw.setPenColor(Color.yellow);

		StdDraw.filledCircle(0.1, 0.085, 0.035);
		StdDraw.filledCircle(0.085, 0.1, 0.035);
		
		StdDraw.setPenColor(Color.green);

		StdDraw.filledCircle(0.9, 0.9+0.015, 0.035);
		StdDraw.filledCircle(0.9+0.015, 0.9, 0.035);
		
		

		
		
	}
}
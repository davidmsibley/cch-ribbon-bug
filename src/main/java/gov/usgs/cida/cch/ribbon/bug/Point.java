/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.usgs.cida.cch.ribbon.bug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author dmsibley
 */
public class Point {

	private static final Logger log = LoggerFactory.getLogger(Point.class);

	private final double x;
	private final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}

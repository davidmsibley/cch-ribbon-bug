package gov.usgs.cida.cch.ribbon.bug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author dmsibley
 */
public class Angle {
	private static final Logger log = LoggerFactory.getLogger(Angle.class);
	
	public static Double getAngle(Point a, Point b) {
		Double result = null;
		double TWO_PI = 2 * Math.PI;

		if (null != a && null != b) {
			double thetaLine = (Math.atan2(b.getY() - a.getY(), b.getX() - a.getX()) + TWO_PI) % TWO_PI;

			double theta = ((thetaLine - (TWO_PI / 4)) + TWO_PI) % TWO_PI;

			result = theta;
		} else {
//				LOGGER.log(Level.WARNING, "Missing a point");
		}

		return result;
	}

	public static Double getAngle(Point a, Point b, Point c) {
		Double result = null;
		double TWO_PI = 2 * Math.PI;

		if (null != a && null != b && null != c) {
			double thetaA = (Math.atan2(b.getY() - a.getY(), b.getX() - a.getX()) + TWO_PI) % TWO_PI;
			double thetaB = (Math.atan2(c.getY() - b.getY(), c.getX() - b.getX()) + TWO_PI) % TWO_PI;

			double theta = ((Math.PI - thetaA + thetaB) + TWO_PI) % TWO_PI;
			double midAngle = theta / 2;

			result = thetaA - midAngle;
		} else {
//				LOGGER.log(Level.WARNING, "Missing a point");
		}

		return result;
	}
}

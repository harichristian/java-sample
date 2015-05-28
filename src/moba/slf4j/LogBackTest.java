package moba.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class LogBackTest {
	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(LogBackTest.class);
	    Marker markerErr = MarkerFactory.getMarker("err");
	    Marker markerOut = MarkerFactory.getMarker("out");
	    
	    logger.trace(markerOut, "TRACE2");
		logger.debug(markerOut, "DEBUG2");
		logger.info(markerOut, "INFO2");
		
		logger.warn(markerErr, "WARN2");
		logger.error(markerErr, "ERROR2");
	}
}

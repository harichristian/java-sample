package moba.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class SampleFilter extends Filter<ILoggingEvent> {

	@Override
	public FilterReply decide(ILoggingEvent event) {
		System.out.println("-------------------------" + event.getMarker().getName());
		if (event.getMessage().contains("out")) {
			System.out.println("OUT");
			return FilterReply.ACCEPT;
		} else {
			return FilterReply.NEUTRAL;
		}
	}
}
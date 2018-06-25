package com.example.demoLib.exception;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "faultcode")
public class FaultCodes {

	private final FaultCode notFound = new FaultCode();

	public FaultCode getNotFound() {
		return notFound;
	}
}

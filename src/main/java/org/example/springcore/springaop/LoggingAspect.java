package org.example.springcore.springaop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	boolean enteringCalled = false;

	public boolean isEnteringCalled() {
		return enteringCalled;
	}
	Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	
	@Before("execution (String printA())")
	public void entering(JoinPoint joinPoint) {
		enteringCalled=true;
		logger.warning("Entering classA"+ (String)joinPoint.getStaticPart().getSignature().toString());
	}
}

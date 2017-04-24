package org.example.springcore.springexample;

import static org.junit.Assert.*;

import org.example.springcore.springaop.LoggingAspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SpringJavaTest {
	@Autowired
	private ClassA classA;
	
	@Autowired
	private LoggingAspect logAspect;
	
	@Test
	public void classAShouldWork() {
		assertNotNull(classA);
	}
	@Test
	public void classAShouldReturnSuccess() {
		assertEquals(classA.printA(),"Success");
	}
	@Test
	public void classAAspectCalled() {
		assertFalse(logAspect.isEnteringCalled());
		classA.printA();
		assertTrue(logAspect.isEnteringCalled());
	}

}

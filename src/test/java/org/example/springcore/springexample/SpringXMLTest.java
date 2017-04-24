package org.example.springcore.springexample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/SpringConfig.xml")
public class SpringXMLTest {
	@Autowired
	ClassA classA;
	
	@Test
	public void testClassA() {
		assertNotNull(classA);
	}
	
}

package org.example.springcore.springexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@Configuration
@ComponentScan(basePackages = "org.example.springcore.springexample")
class JavaTestContext {

}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaTestContext.class)
public class AppTest {
		@Autowired
		ClassC objC;
		
	
		@Test
		public void dummyTest() {
			assertEquals("Success", objC.printC());
		}
}
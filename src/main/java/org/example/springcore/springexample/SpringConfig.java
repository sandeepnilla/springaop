package org.example.springcore.springexample;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="org.example.springcore" )
public class SpringConfig {
//	@Bean
//	public ClassA classA() {
//		return new ClassA();
//	}
}

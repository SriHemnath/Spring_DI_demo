package com.biju.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biju.Service.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
						
				// retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				Coach theCoach2 = context.getBean("mySplCoach", Coach.class);
				
				// call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				// let's call our new method for fortunes
				System.out.println(theCoach.getDailyFortune());
				
				System.out.println(theCoach2.getDailyWorkout());
				System.out.println(theCoach2.getDailyFortune());
				
				// close the context
				context.close();
	}

}

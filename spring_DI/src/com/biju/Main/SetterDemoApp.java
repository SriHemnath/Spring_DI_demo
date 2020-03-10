package com.biju.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biju.ServiceImpl.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrieve bean from spring container
				CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
				
				// call methods on the bean
				// ... let's come back to this ...
				System.out.println(theCoach.getDailyWorkout());
				
				System.out.println(theCoach.getDailyFortune());
								
				// close the context
				context.close();
	}

}

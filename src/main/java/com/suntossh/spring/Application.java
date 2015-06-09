package com.suntossh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		final ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		MyResourceReader myResourceReader = context.getBean("myResourceReader", MyResourceReader.class);
		myResourceReader.print();
		
		
		
		/*for (int i = 0; i < 1000; i++) {
			Thread t = new Thread(new Runnable() {

				public void run() {
					for (int i = 0; i < 1000; i++) {
						MyResourceReader myResourceReader = context.getBean(
								"myResourceReader", MyResourceReader.class);
						//myResourceReader.print();
						System.out.println(myResourceReader);
					}
				}
			});
			t.start();
		}*/

	}
}

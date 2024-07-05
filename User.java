package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
	
	public static void main( String[] args ) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext( "src/main/resources/app.xml" );
		Employee emp = ( Employee ) ctx.getBean( "e" );
		System.out.println( emp.getId() + " " + emp.getName() + " " + emp.getSal() + " " + emp.getAdr().getCity() + " " + emp.getAdr().getState() );
		
		
	
		
	}

}

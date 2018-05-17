package com.aopex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class mainClass {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:bean.xml");
		
		Cats  myCat = ctx.getBean("myCat", Cats.class);
		
		System.out.println(myCat.toString());
		
		myCat.CatInfo();
	}
}

package com.aopex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect //Aspect 역할을 할 class
public class LogAOP {

	@Around("within(com.aopex.*)")
	public Object loggerAop(ProceedingJoinPoint joinpoint)throws Throwable {
		
		//공통 기능이 적용되는 메소드가 어떤 메소드인지 출력하기위해 메소드명을 취득한다.
		String signatureStr = joinpoint.getSignature().toShortString();
		
		System.out.println(signatureStr + " 시작");
		
		//공통기능
		System.out.println("실행전 : " + System.currentTimeMillis());
		
		try {
			Object obj = joinpoint.proceed(); //핵심기능 실행
			return obj;
		} finally {
			//공통기능
			System.out.println("실행후 : " + System.currentTimeMillis());
			
			System.out.println(signatureStr + " 종료");
		}
	}
}

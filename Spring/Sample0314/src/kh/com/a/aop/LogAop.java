package kh.com.a.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAop {
	
	@Around("within(kh.com.a.dao.impl.*)")
	public Object loggerApp(ProceedingJoinPoint jp) throws Throwable {
		String signatureStr = jp.getSignature().toShortString();
		
		System.out.println("loggerApp: "+signatureStr+" 메소드 실행");
		
		Object obj = jp.proceed();
		return obj;
	}
}

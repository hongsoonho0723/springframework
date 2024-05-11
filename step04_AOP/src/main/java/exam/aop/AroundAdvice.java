package exam.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/*
 * 사전, 사후처리
 */
public class AroundAdvice {

	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AroundAdvice의 around 방식의 사전 처리입니다.\n");

		Object obj =  joinPoint.proceed(); //다음 advice or target 호출
		
		System.out.println("AroundAdvice의 around 방식의 사후 처리입니다.\n");
		
		return obj;
	}
	
}

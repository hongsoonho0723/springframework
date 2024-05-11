package exam.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
 * 사전, 사후처리
 */
@Component //생성
@Aspect
@Order(1)
public class AroundAdvice {

	@Around("PointCuteDefinition.aa()") //클래스이름.method이름
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AroundAdvice의 around 방식의 사전 처리입니다.\n");

		Object obj =  joinPoint.proceed(); //다음 advice or target 호출
		
		System.out.println("AroundAdvice의 around 방식의 사후 처리입니다.\n");
		
		return obj;
	}
	
}

package exam.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SampleAdvice {

	/*
	 * 사전처리
	 * */
	@Before("PointCuteDefinition.aa()")
	public void before(JoinPoint joinPoint) { //method에 대한 정보가 필요할경우에만 JoinPoint를 사용
											//ProceedingJoinPoint를 사용하는지 않는이유는 사후처리를 할 필요가 없기때문에
		String methodName = joinPoint.getSignature().getName();
		Object params [] = joinPoint.getArgs(); //인수 정보
		
		System.out.println("SampleAdvice의 before 입니다...");
		System.out.println("인수의 개수 : "+params.length + "\n");

	}
	
	/*
	 * 사후처리 : 예외발생여부 상관없이
	 * */
	@After("PointCuteDefinition.aa()")
	public void afterFinally() {
		System.out.println("SampleAdvice의 afterFinally 실행중입니다... \n");
		
	}
	
	/*
	 * 사후처리 : 정상일때
	 * @param : object obj는 타겟대상이 리턴한 값을 인수로 전달받는다
	 * */
	@AfterReturning(pointcut = "PointCuteDefinition.aa()" , returning = "obj")
	
	public void afterReturing(JoinPoint joinPoint , Object obj) {
		String methodName = joinPoint.getSignature().getName();

		
		System.out.println("SampleAdvice의 afterReturing 실행중입니다... \n");
		System.out.println(methodName +"의 리턴값은 "+obj + "\n");
	}
	
	
	
	/*
	 * 사후처리 : 예외발생했을때
	 * */
	@AfterThrowing(pointcut ="PointCuteDefinition.aa()" , throwing = "e")
	public void afterThrow(Throwable e) {
		System.out.println("SampleAdvice의 afterThrow 실행중입니다... \n");
		System.out.println("예외정보 = "+ e);
	}
	
	
}






















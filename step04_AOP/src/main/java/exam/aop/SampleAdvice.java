package exam.aop;

import org.aspectj.lang.JoinPoint;

public class SampleAdvice {

	/*
	 * 사전처리
	 * */
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
	public void afterFinally() {
		System.out.println("SampleAdvice의 afterFinally 실행중입니다... \n");
		
	}
	
	/*
	 * 사후처리 : 정상일때
	 * @param : object obj는 타겟대상이 리턴한 값을 인수로 전달받는다
	 * */
	public void afterReturing(JoinPoint joinPoint , Object obj) {
		String methodName = joinPoint.getSignature().getName();

		
		System.out.println("SampleAdvice의 afterReturing 실행중입니다... \n");
		System.out.println(methodName +"의 리턴값은 "+obj + "\n");
	}
	
	
	
	/*
	 * 사후처리 : 예외발생했을때
	 * */
	public void afterThrow(Throwable e) {
		System.out.println("SampleAdvice의 afterThrow 실행중입니다... \n");
		System.out.println("예외정보 = "+ e);
	}
	
	
}






















package exam.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/*
 * 공통기능 (사전, 사후처리 = around방식)
 * 	: 사전 - 현재시간을 구한다.
 * 
 * 	: 사후 - 현재시간을 구해서 사전시간을 뺀다.
 * */
public class TimerAdvice {
	/*
	 * around방식에서는 인수는 ProceedingJoinPoint 선언
	 * 	: 다음 advice or 타겟대상을 호출하기 위해서는 필수
	 * 
	 * 	@return : Object 선언
	 * 			  타겟대상이 리턴한 값을 다시 리턴해서 호출한 주체에게 전달 
	 * 
	 * */
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String methodName = joinPoint.getSignature().getName(); //호출한 메소드 이름
		
		Object params [] = joinPoint.getArgs(); // 인수값
		System.out.println("[LOG]" + methodName + "호출되기 전 사전 처리중입니다");
		System.out.println("[LOG]" + methodName + "의 인수의 개수 : " + params.length);
		for(Object param : params) {
			System.out.println(param+" , ");
		}
		
		System.out.println();
		
		
		//사전 처리
		StopWatch sw = new StopWatch();
		sw.start();
		
		//실제타겟대상 호출
		Object obj = joinPoint.proceed(); //다음 advice or 타겟대상을 호출

		//사후 처리
		sw.stop();
		System.out.println("[LOG]" + methodName + "리턴값 obj = "+obj);
		System.out.println("[LOG]" + methodName + "총 실행 시간 ms = "+ sw.getTotalTimeMillis()+"ms");
		System.out.println("[LOG]" + methodName + "사후처리 완료되었습니다. \n");
		
		
		return obj;
		
	}
	
	
	
	
}

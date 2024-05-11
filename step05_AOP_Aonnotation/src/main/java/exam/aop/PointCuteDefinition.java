package exam.aop;
/*
 * pointCut을 정의 하는 클래스
 * */

import org.aspectj.lang.annotation.Pointcut;

public class PointCuteDefinition {
	
	@Pointcut("execution(public * exam.service.MemberServiceImpl.*(..))")
	public void aa() {}
	
	@Pointcut("execution(public void exam.service.MemberServiceImpl.select(..))")
	public void bb() {}
	
	@Pointcut("execution(* exam.service.MemberServiceImpl.insert())")
	public void cc() {}
	
}

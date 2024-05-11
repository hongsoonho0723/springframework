package exam.advice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogAdvice {

	BufferedWriter bw;
	public LogAdvice() {
		
		
		try {
		bw = new BufferedWriter(new FileWriter("src/main/java/exam/advice/log.txt",true));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

	
	/*
	 * 공통의 기능 사전, 사후 처리 - around
	 * */
	
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		
		//사전
		String methodName= joinPoint.getSignature().getName();
		Object params [] = joinPoint.getArgs();
		
		bw.write(methodName+"호출");
		bw.write("인수의 개수 = "+params.length+" / ");
		
		StopWatch sw = new StopWatch();
		sw.start();
		Object obj =  joinPoint.proceed(); //다음 advice or target 호출
		sw.stop();
		
		
		//사후
		bw.write("리턴 값 : "+ obj+"/");
		bw.write("총 소요 시간 : "+ sw.getTotalTimeMillis()+"ns");
		bw.newLine();
		bw.flush();
		
		
		
		return obj;
	}
	
	
	
}

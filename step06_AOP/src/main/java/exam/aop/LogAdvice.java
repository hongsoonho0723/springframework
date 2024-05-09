package exam.aop;

import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {

	FileWriter fw;
	
	public LogAdvice() {
		try {
		fw = new FileWriter("src/main/java/exam/aop/log.tex",true);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		/*
		fw.write(null);
		fw.flush();
		*/
		Object obj =  joinPoint.proceed(); //다음 advice or target 호출
		
		return obj;
	}
	
	
	
}

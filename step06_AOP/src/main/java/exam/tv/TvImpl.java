package exam.tv;

import exam.service.Player;

public class TvImpl implements Player {

	@Override
	public void start(int volumn) {

		System.out.println(super.getClass().getName() +"의 start(int volumn) 핵심기능...");
		
	}

	@Override
	public String pause() {
		System.out.println(super.getClass().getName() +"의 pause() 핵심기능...");
		return "hi";
	}

	@Override
	public void stop() {
		System.out.println(super.getClass().getName() +"의 stop() 핵심기능...");

	}

}

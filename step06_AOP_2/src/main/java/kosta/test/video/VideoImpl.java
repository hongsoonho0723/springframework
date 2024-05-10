package kosta.test.video;

import kosta.test.service.Player;

public class VideoImpl implements Player {

	@Override
	public void start(int i) {
		System.out.println(super.getClass().getName() +"의 start(int i)   핵심기능...");

	}

	@Override
	public String pause() {
		System.out.println(super.getClass().getName() +"의 pause()   핵심기능...");
		return "하이";
	}

	@Override
	public void stop() {
		System.out.println(super.getClass().getName() +"의 stop()   핵심기능...");

	}

}

package kr.co.ch02.sub5;

import org.springframework.stereotype.Component;

@Component("sub5Spk")
public class Speaker  {

	public void soundUp() {
		System.out.println("Speaker soundUP...");
	}
	public void soundDown() {
		System.out.println("Speaker soundDown...");
	}
}

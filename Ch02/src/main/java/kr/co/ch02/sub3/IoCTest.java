package kr.co.ch02.sub3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 *  날짜: 2020/08/31
 *  이름: 김보미
 *  내용 : 스프링 Ioc - DI setter 적용
 * 
 * 
 * */


public class IoCTest {
	public static void main(String[] args) {
			
		// Ioc를 Setter DI로 적용할 경우
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		
		TV lgTV = (TV) ctx.getBean("sub3LgTV");
		TV samsungTV = (TV) ctx.getBean("sub3SamsungTV");
		
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
		
		
	}
}

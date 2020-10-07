package kr.co.winery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("kr.co.winery")
public class WineryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WineryApplication.class, args);
	}

}

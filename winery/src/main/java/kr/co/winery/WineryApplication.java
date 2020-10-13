package kr.co.winery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("kr.co.winery")
public class WineryApplication extends SpringBootServletInitializer{

		public static void main(String[] args) {
		SpringApplication.run(WineryApplication.class, args);
		}
		
		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			return builder.sources(WineryApplication.class);
			
	}

}

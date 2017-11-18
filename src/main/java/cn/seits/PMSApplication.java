package cn.seits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
@MapperScan("cn.seits.modules.**.dao")
public class PMSApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PMSApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PMSApplication.class);
	}
}

package functions;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import models.PlatformEvent;

@Configuration
public class PojoFunction {

	@Bean
	public Function<PlatformEvent, String> pojo() {
		return s -> {
			String pojo = s.toString();
			return pojo;
		};
	}
}

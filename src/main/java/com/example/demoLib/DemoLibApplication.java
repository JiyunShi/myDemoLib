package com.example.demoLib;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan( excludeFilters = {
		@ComponentScan.Filter(type = FilterType.REGEX, pattern = { "com\\.safeway\\.app\\.ppapshr\\.cache\\..*" }) })
@PropertySource(value = { "classpath:/FaultCodes.properties"})
public class DemoLibApplication {
	/**
	 * Note: many Jackson2ObjectMapperBuilderCustomizer beans can be defined and
	 * they will all be applied on the Jackson2ObjectMapperBuilder that Spring
	 * Boot uses to build the ObjectMapper it will use
	 *
	 * @return customizer function that will set the given
	 *         Jackson2ObjectMapperBuilder's time zone to the current system's
	 *         time zone
	 */
	@Bean
	public Jackson2ObjectMapperBuilderCustomizer setObjectMapperTimeZoneToCurrent() {
		return builder -> {
			TimeZone timeZone = Calendar.getInstance().getTimeZone();
			builder.timeZone(timeZone);
		};
	}


}


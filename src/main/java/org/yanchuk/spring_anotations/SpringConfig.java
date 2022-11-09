package org.yanchuk.spring_anotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.yanchuk.spring_anotations")
@PropertySource("classpath:musicPlayerV2.properties")
public class SpringConfig {

}
